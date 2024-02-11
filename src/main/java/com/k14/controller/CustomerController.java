package com.k14.controller;

import com.k14.model.Customer;
import com.k14.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ks")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/list-cus")
    public String getView(Model model){
        List<Customer>list = customerService.read();
        model.addAttribute("list",list);
        return "customer/list";
    }
    @GetMapping("/create-cus")
    public String getCreate(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer/create";
    }
    @PostMapping("/save-cus")
    public String postCreate(@ModelAttribute Customer customer){
        customerService.save(customer);
        return "redirect:/ks/list-cus";
    }
    @GetMapping("/update-cus")
    public String getUpdate(Model model, @RequestParam int id){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer",customer);
        return "customer/create";
    }
    @GetMapping("/delete-cus")
    public String getDel(Model model, @RequestParam int id){
        customerService.delete(id);
        List<Customer>list=customerService.read();
        model.addAttribute("list",list);
        return "customer/list";
    }


}
