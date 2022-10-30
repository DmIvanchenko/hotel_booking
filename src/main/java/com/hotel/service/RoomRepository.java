package com.hotel.service;

import com.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;


interface RoomRepository extends CrudRepository<Room, Long>, JpaSpecificationExecutor<Room> {
    /* Custom queries with join */
    Room findByNumber(String number);
}
