package com.lakshan.spring_batch_processing_demo.Repository;

import com.lakshan.spring_batch_processing_demo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
