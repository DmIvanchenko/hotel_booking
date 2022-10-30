package com.hotel.service;


import com.hotel.model.RoomCustomersNumber;
import org.springframework.data.repository.CrudRepository;

public interface CustomersNumberRepository extends CrudRepository<RoomCustomersNumber, String> {

}
