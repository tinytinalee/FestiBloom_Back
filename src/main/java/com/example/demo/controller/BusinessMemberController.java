package com.example.demo.controller;

import com.example.demo.service.BusinessMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/business")
public class BusinessMemberController {

    @Autowired
    private BusinessMemberService service;

    @GetMapping("/check-id")
    public Map<String, Boolean> checkDuplicateId(@RequestParam String bMemId) {
        boolean available = service.isIdAvailable(bMemId);
        Map<String, Boolean> result = new HashMap<>();
        result.put("available", available);
        return result;
    }
}
