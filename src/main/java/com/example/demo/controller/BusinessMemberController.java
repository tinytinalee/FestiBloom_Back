package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.BusinessMember;
import com.example.demo.service.BusinessMemberService;

@RestController
@RequestMapping("/api/business")
public class BusinessMemberController {

    @Autowired
    private BusinessMemberService service;

    @PostMapping("/join")
    public BusinessMember join(@RequestBody BusinessMember member) {
        return service.register(member);
    }
}
