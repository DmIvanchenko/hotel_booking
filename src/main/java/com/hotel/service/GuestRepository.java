package com.hotel.service;

import com.hotel.model.Guest;
import org.springframework.data.repository.CrudRepository;


interface GuestRepository extends CrudRepository<Guest, Long> {
    /* Custom queries with join */
    Guest findByLogin(String login);
}
