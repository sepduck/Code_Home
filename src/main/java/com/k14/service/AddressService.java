package com.k14.service;

import com.k14.model.Address;

import java.util.List;

public interface AddressService {
    void create(Address address);
    List<Address>read();
    void delete(int id);
    Address findById(int id);
}
