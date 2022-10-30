package com.hotel.service;

import com.hotel.model.Guest;


public interface GuestService {
    /* Basic CRUD operations */
    Guest findByLogin(String login);
    Guest save(Guest guest);
    void delete(Long id);
}
