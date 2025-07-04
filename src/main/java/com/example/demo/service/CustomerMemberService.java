package com.example.demo.service;

import com.example.demo.dao.CustomerMemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerMemberService {

    @Autowired
    private CustomerMemberDAO repository;

    public boolean isIdAvailable(String cMemId) {
        return !repository.existsByCmemId(cMemId);
    }
}
