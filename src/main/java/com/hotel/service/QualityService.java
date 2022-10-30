package com.hotel.service;

import com.hotel.model.RoomQualityType;

import java.util.List;

public interface QualityService {
    List<RoomQualityType> findAll();
}
