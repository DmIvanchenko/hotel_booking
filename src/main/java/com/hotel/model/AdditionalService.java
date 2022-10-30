package com.hotel.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "additional_service")
public class AdditionalService {

    private String service;

    @Id
    @NotEmpty(message="{not_empty_text}")
    @Column(name = "additional_services")
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public AdditionalService(String service) {
        this.service = service;
    }

    public AdditionalService() {
    }

    @Override
    public String toString() {
        return service;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalService that = (AdditionalService) o;
        return Objects.equals(service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service);
    }
}
