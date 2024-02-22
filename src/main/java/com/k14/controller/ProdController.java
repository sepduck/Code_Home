package com.k14.controller;

import com.k14.model.Prod;
import com.k14.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("prod")
public class ProdController {
    @Autowired
    private ProdService prodService;

    @PostMapping("/save")
    public ResponseEntity<?> postCreate(@ModelAttribute Prod prod){
        return prodService.save(prod);
    }
    public ResponseEntity<?> list(Model model){
        List<Prod>list = (List<Prod>) prodService.list();
        model.addAttribute("list",list);
        return ""
    }

}
