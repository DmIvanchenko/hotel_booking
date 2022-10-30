package com.hotel.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "rooms")
public class Room {
    private Long id;

    private String roomFloorType;
    private String roomCustomersNumber;
    private String roomQualityType;
    private String roomViewType;
    private String number;
    private Breakfast breakfast;
    private String serviceForRoom;
    private RoomDirection direction;
    private Double price;
    private Set<Reservation> reservations = new HashSet<Reservation>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }





    @Column(name = "room_breakfast")
    @Enumerated(EnumType.STRING)
    public Breakfast getBreakfast(){return breakfast;}
    public void setBreakfast(Breakfast breakfast){this.breakfast = breakfast;}




    @Column(name = "room_price")
    public Double getPrice(){return price;}
    public void setPrice(Double price){this.price = price;}



    @Column(name = "type_of_floor")
    public String getRoomFloorType(){return  roomFloorType;}
    public void setRoomFloorType(String roomFloorType){this.roomFloorType =  roomFloorType;}


    @Column(name = "type_by_customers")
    public String getRoomCustomersNumber(){return roomCustomersNumber;}
    public void setRoomCustomersNumber(String roomCustomersNumber){this.roomCustomersNumber =  roomCustomersNumber;}



    @NotEmpty(message="{not_empty_text}")
    @Size(max = 4,
        message = "{max_room_number}")
    @Column(name = "room_number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }





    @Column(name = "room_quality")
    public String getRoomQualityType(){return roomQualityType;}
    public void setRoomQualityType(String roomQualityType){this.roomQualityType = roomQualityType;}


    @Column(name = "view_from_room")
    public String getRoomViewType(){return  roomViewType;}

    public void setRoomViewType(String roomViewType) {
        this.roomViewType =  roomViewType;
    }

    @Column(name = "room_direction")
    @Enumerated(EnumType.STRING)
    public RoomDirection getDirection() {
        return direction;
    }

    public void setDirection(RoomDirection direction) {
        this.direction = direction;
    }


    @Column(name = "room_additional_services")
    public String getServiceForRoom(){return serviceForRoom;}
    public void setServiceForRoom(String serviceForRoom){this.serviceForRoom =serviceForRoom;}

    @OneToMany(mappedBy = "room",
            cascade = CascadeType.ALL)
    @OrderBy("from ASC, to ASC")
    public Set<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", guests per room= " + roomCustomersNumber +
                ", floor type= " + roomFloorType +
                ", room quality= " + roomQualityType +
                ", view on= " + roomViewType +
                ", breakfast added= " + breakfast +
                ", direction=" + direction +
                ", reservations=" + reservations +
                ", price= " + price +
                '}';
    }
}
