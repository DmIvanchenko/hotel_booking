package com.hotel.service;

import com.hotel.model.RoomViewType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Repository
@Transactional
@Service("roomViewTypeService")
public class RoomViewTypeServiceImpl implements RoomViewTypeService{
   private RoomViewTypeRepository roomViewTypeRepository;
    @Autowired
    public void setRoomViewTypeRepository(RoomViewTypeRepository roomViewTypeRepository) {
        this.roomViewTypeRepository = roomViewTypeRepository;
    }

    @Override
    public List<RoomViewType> findAll() {
        return (List<RoomViewType>) roomViewTypeRepository.findAll();
    }
}
