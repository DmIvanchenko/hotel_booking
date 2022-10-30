package com.hotel.service;

import com.hotel.model.RoomFloorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@Service("roomFloorTypeService")
public class RoomFloorTypeServiceImpl implements RoomFloorTypeService{

    private RoomFloorTypeRepository roomFloorTypeRepository;
    @Autowired
    public void setRoomFloorTypeRepository(RoomFloorTypeRepository roomFloorTypeRepository) {
        this.roomFloorTypeRepository = roomFloorTypeRepository;
    }




    @Override
    public List<RoomFloorType> findAll() {
        return (List<RoomFloorType>) roomFloorTypeRepository.findAll();
    }
}
