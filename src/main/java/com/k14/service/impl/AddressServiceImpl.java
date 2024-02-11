package com.k14.service.impl;

import com.k14.model.Address;
import com.k14.repository.AddressRepository;
import com.k14.repository.CustomerRepository;
import com.k14.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void create(Address address) {
        addressRepository.save(address);
    }

    @Override
    public List<Address> read() {
        List<Address>list = addressRepository.findAll();
        return list;
    }

    @Override
    public void delete(int id) {
        addressRepository.deleteById(id);
    }

    @Override
    public Address findById(int id) {
        Address address = addressRepository.findById(id).get();
        return address;
    }
}
