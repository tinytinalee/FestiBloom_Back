package com.example.demo.controller;

import com.example.demo.entity.BusinessMember;
import com.example.demo.service.BusinessMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/business")
@CrossOrigin
public class BusinessMemberController {

    @Autowired
    private BusinessMemberService businessMemberService;

    @GetMapping("/check-id")
    public boolean checkDuplicateId(@RequestParam String bMemId) {
        return businessMemberService.isIdDuplicate(bMemId);
    }

    @PostMapping("/join")
    public void join(@RequestBody BusinessMember business) {
        businessMemberService.join(business);
    }
}
