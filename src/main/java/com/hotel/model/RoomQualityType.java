package com.hotel.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "room_type_by_quality")
public class RoomQualityType {
    private String type;

    @Id
    @NotEmpty(message="{not_empty_text}")
    @Column(name = "room_type_name")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RoomQualityType(String type) {
        this.type = type;
    }

    public RoomQualityType() {
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomQualityType that = (RoomQualityType) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
