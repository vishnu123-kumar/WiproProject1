package com.wiproproject.WiproProject1.repository;

import com.wiproproject.WiproProject1.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDetails,Integer> {
}
