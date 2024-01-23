package com.zhangyuhan.onlineorder.controller;

import com.zhangyuhan.onlineorder.model.RegisterBody;
import com.zhangyuhan.onlineorder.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/signup")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody RegisterBody body) {
        customerService.signUp(body.email(), body.password(), body.firstName(), body.lastName());
    }
}
