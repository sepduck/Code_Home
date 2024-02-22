package com.k14.service.impl;

import com.k14.base.BaseResponse;
import com.k14.model.Product;
import com.k14.repository.ProductRepository;
import com.k14.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends BaseResponse implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<?> getList() {
        List<Product> products = productRepository.findAll();
        return getReponseEntity((Product) products);
    }

    @Override
    public ResponseEntity<?> save(Product product) {
        Product product1 = productRepository.save(product);
        return getReponseEntity(product1);
    }

    @Override
    public ResponseEntity<?> delete(int id) {
        productRepository.deleteById(id);
        return null;
    }

    @Override
    public ResponseEntity<?> findById(int id) {
        productRepository.findById(id);
        return null;
    }
}
