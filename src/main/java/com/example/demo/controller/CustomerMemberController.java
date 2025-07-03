package com.example.demo.controller;

import com.example.demo.service.CustomerMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class CustomerMemberController {

    @Autowired
    private CustomerMemberService service;

    @GetMapping("/check-id")
    public Map<String, Boolean> checkDuplicateId(@RequestParam String cMemId) {
        boolean available = service.isIdAvailable(cMemId);
        Map<String, Boolean> result = new HashMap<>();
        result.put("available", available);
        return result;
    }
}
