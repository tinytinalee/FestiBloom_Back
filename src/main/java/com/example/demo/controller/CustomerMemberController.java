package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.CustomerMember;
import com.example.demo.service.CustomerMemberService;

@RestController
@RequestMapping("/api/customer")
public class CustomerMemberController {

    @Autowired
    private CustomerMemberService service;
    
    @GetMapping
    public void test(){
    	
    }
    
    @PostMapping("/hello")
    public void hello() {
    	
    }
    
    @PostMapping("/join")
    public CustomerMember join(@RequestBody CustomerMember member) {
        return service.register(member);
    }
}
