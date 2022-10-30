package com.hotel.service;

import com.hotel.model.RoomQualityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@Service("qualityService")
public class QualityServiceImpl implements QualityService{
    private QualityRepository qualityRepository;


    public QualityRepository getQualityRepository() {
        return qualityRepository;
    }
    @Autowired
    public void setQualityRepository(QualityRepository qualityRepository) {
        this.qualityRepository = qualityRepository;
    }


    @Override
    public List<RoomQualityType> findAll() {
        return (List<RoomQualityType>) qualityRepository.findAll();
    }
}
