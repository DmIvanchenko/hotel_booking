package com.hotel.service;

import com.hotel.model.RoomCustomersNumber;

import java.util.List;

public interface CustomersNumberService {
    List<RoomCustomersNumber> findAll();
}
