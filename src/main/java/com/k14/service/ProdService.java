package com.k14.service;

import com.k14.model.Prod;
import org.springframework.http.ResponseEntity;

public interface ProdService {
    ResponseEntity<?> save(Prod prod);
    ResponseEntity<?> list();
    ResponseEntity<?> delete(int id);
    ResponseEntity<?> findById(int id);
}
