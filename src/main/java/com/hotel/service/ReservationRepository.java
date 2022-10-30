package com.hotel.service;

import com.hotel.model.Guest;
import com.hotel.model.Reservation;
import com.hotel.model.Room;
import org.joda.time.DateTime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


interface ReservationRepository extends CrudRepository<Reservation, Long> {
    /* Custom queries with join */
    List<Reservation> findOneByRoomAndDates(@Param("id") Long id, @Param("rid") Long roomId, @Param("fr") DateTime from, @Param("to") DateTime to);
    List<Reservation> findAllByGuestAndRoom(Guest guest, Room room);
}
