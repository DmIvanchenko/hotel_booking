package com.hotel.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "room_customers_number")
public class RoomCustomersNumber {

    private String customersNumber;

   @Id
    @NotEmpty(message="{not_empty_text}")
    @Column(name = "room_type")
    public String getCustomersNumber() {
        return customersNumber;
    }

    public void setCustomersNumber(String customersNumber) {
        this.customersNumber = customersNumber;
    }

    public RoomCustomersNumber(String customersNumber) {
        this.customersNumber = customersNumber;
    }

    public RoomCustomersNumber() {
    }

    @Override
    public String toString() {
        return customersNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomCustomersNumber that = (RoomCustomersNumber) o;
        return Objects.equals(customersNumber, that.customersNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customersNumber);
    }
}
