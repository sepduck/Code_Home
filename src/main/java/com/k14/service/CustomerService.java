package com.k14.service;

import com.k14.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    List<Customer>read();
    void delete(int id);
    Customer findById(int id);
}
