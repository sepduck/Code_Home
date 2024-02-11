package com.k14.service.impl;

import com.k14.model.Customer;
import com.k14.repository.CustomerRepository;
import com.k14.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> read() {
        List<Customer> list = customerRepository.findAll();
        return list;
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        Customer customer = customerRepository.findById(id).get();
        return customer;
    }
}
