package com.lakshan.spring_batch_processing_demo.Config;

import com.lakshan.spring_batch_processing_demo.Entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }

}
