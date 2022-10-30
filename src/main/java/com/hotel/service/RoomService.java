package com.hotel.service;

import com.hotel.model.Room;
import com.hotel.model.RoomDirection;

import java.util.List;


public interface RoomService {
    /* Basic CRUD operations */
    List<Room> findAllByCriteria(String number, Double price, String roomFloorType, String customersNumber,
                                 String roomViewType, String roomQualityType,
                                 RoomDirection direction);
    Room findOne(Long id);
    Room findByNumber(String number);
    Room save(Room room);
    void delete(Long id);
}
