package com.k14.service;

import com.k14.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<?> getList();
    ResponseEntity<?> save(Product product);
    ResponseEntity<?> delete(int id);
    ResponseEntity<?> findById(int id);
}
