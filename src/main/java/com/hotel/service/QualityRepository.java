package com.hotel.service;

import com.hotel.model.RoomQualityType;
import org.springframework.data.repository.CrudRepository;

public interface QualityRepository extends CrudRepository<RoomQualityType, Long> {

}
