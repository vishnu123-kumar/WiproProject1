package com.wiproproject.WiproProject1.controller;

import com.wiproproject.WiproProject1.model.CustomerDetails;
import com.wiproproject.WiproProject1.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerServices;
    @PostMapping
    public void create(CustomerDetails details){
        customerServices.create(details) ;

    }
}
