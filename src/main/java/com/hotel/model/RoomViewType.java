package com.hotel.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "room_view")
public class RoomViewType {

    private String type;


    @Id
    @NotEmpty(message="{not_empty_text}")
    @Column(name = "view_type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RoomViewType(String type) {
        this.type = type;
    }

    public RoomViewType() {
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomViewType that = (RoomViewType) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
