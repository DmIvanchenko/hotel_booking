package com.hotel.service;



import com.hotel.model.RoomCustomersNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Service("customersNumberService")
public class CustomersNumberServiceImpl implements CustomersNumberService{

    private CustomersNumberRepository customersNumberRepository;




    @Autowired
    public void setCustomersNumberRepository(CustomersNumberRepository customersNumberRepository) {
        this.customersNumberRepository = customersNumberRepository;
    }

    @Override
    public List<RoomCustomersNumber> findAll(){
        return (List<RoomCustomersNumber>) customersNumberRepository.findAll();
    }

}
