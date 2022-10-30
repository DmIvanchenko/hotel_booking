package com.hotel.service;

import com.hotel.model.AdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
@Service("additionalServiceService")

public class AdditionalServiceServiceImpl implements AdditionalServiceService{

    private AdditionalServiceRepository additionalServiceRepository;




    @Autowired
    public void setAdditionalServiceRepository(AdditionalServiceRepository additionalServiceRepository) {
        this.additionalServiceRepository = additionalServiceRepository;
    }


    @Override
    public List<AdditionalService> findAll() {
        return (List<AdditionalService>) additionalServiceRepository.findAll();
    }
}
