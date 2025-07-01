package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.CustomerMemberDAO;
import com.example.demo.entity.CustomerMember;

@Service
public class CustomerMemberService {

    @Autowired
    private CustomerMemberDAO dao;

    public CustomerMember register(CustomerMember member) {
        return dao.save(member);
    }
}