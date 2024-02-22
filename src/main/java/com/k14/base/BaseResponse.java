package com.k14.base;

import com.k14.model.Customer;
import com.k14.model.Prod;
import com.k14.model.Product;
import org.springframework.http.ResponseEntity;

public class BaseResponse {
    protected ResponseEntity<?> getReponseEntity(Object data){

        return ResponseEntity.ok(getReponse(data));
    }
    private Prod getReponse(Object data){
        Prod prod = new Prod();
        prod.setData(data);
        prod.setStatus(200);
        prod.setMessage("success");
        return prod;

    }
}
