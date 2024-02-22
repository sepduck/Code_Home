package com.k14.service.impl;

import com.k14.base.BaseResponse;
import com.k14.model.Prod;
import com.k14.repository.ProdRepository;
import com.k14.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdServiceImpl extends BaseResponse implements ProdService {
    @Autowired
    private ProdRepository prodRepository;
    @Override
    public ResponseEntity<?> save(Prod prod) {
        Prod prod1 = (Prod) prodRepository.save(prod);
        return getReponseEntity(prod1);
    }

    @Override
    public ResponseEntity<?> list() {
        List<Prod>list = prodRepository.findAll();
        return getReponseEntity(list);
    }

    @Override
    public ResponseEntity<?> delete(int id) {
        prodRepository.deleteById(id);
        return getReponseEntity("Thanh cong");
    }

    @Override
    public ResponseEntity<?> findById(int id) {
        Prod prod = (Prod) prodRepository.findById(id).get();
        return getReponseEntity(prod);
    }
}
