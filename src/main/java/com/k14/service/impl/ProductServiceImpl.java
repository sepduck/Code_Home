package com.k14.service.impl;

import com.k14.model.Product;
import com.k14.repository.ProductRepository;
import com.k14.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> read() {
        return productRepository.findAll();
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        Product product = productRepository.findById(id).get();
        return product;
    }
}
