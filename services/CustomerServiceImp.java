package com.wiproproject.WiproProject1.services;

import com.wiproproject.WiproProject1.model.CustomerDetails;
import com.wiproproject.WiproProject1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    CustomerRepository rep;
    @Override
    public void create(CustomerDetails d) {
        rep.save(d);


    }
}
