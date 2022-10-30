package com.hotel.service;

import com.hotel.model.Guest;
import com.hotel.model.Reservation;
import com.hotel.model.Room;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {
    private ReservationRepository reservationRepository;

    @Autowired
    public void setReservationRepository(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Reservation> findOneByRoomAndDates(Long id, Long roomId, DateTime from, DateTime to) {
        return reservationRepository.findOneByRoomAndDates(id, roomId, from, to);
    }

    @Override
    public List<Reservation> findAllByGuestAndRoom(Guest guest, Room room) {
        return reservationRepository.findAllByGuestAndRoom(guest, room);
    }

    @Override
    public Reservation findOne(Long id) {
        return reservationRepository.findOne(id);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void delete(Long id) {
        reservationRepository.delete(id);
    }
}
