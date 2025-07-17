package com.example.demo.service;

import com.example.demo.dao.CustomerMemberDAO;
import com.example.demo.entity.CustomerMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerMemberService {

    @Autowired
    private CustomerMemberDAO customerMemberDAO;

    public boolean isIdDuplicate(String cMemId) {
        return customerMemberDAO.existsById(cMemId);
    }

    public void join(CustomerMember customer) {
        customerMemberDAO.save(customer);
    }
}