package com.k14.service;

import com.k14.model.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);

    List<Product> read();
    void delete(int id);
    Product findById(int id);
}
