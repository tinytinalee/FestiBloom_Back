package com.example.demo.controller;

import com.example.demo.entity.CustomerMember;
import com.example.demo.service.CustomerMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin
public class CustomerMemberController {

    @Autowired
    private CustomerMemberService customerMemberService;

    @GetMapping("/check-id")
    public boolean checkDuplicateId(@RequestParam String cMemId) {
        return customerMemberService.isIdDuplicate(cMemId);
    }

    @PostMapping("/join")
    public void join(@RequestBody CustomerMember customer) {
        customerMemberService.join(customer);
    }
}
