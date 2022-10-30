package com.hotel.service;

import com.hotel.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;


public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    GuestService guestService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Guest guest = guestService.findByLogin(login);
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority(guest.getRole().name()));
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(guest.getLogin(),
                guest.getPassword(), roles);
        return userDetails;
    }
}
