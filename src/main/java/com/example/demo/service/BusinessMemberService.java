package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.BusinessMemberDAO;
import com.example.demo.entity.BusinessMember;

@Service
public class BusinessMemberService {

    @Autowired
    private BusinessMemberDAO dao;

    public BusinessMember register(BusinessMember member) {
        return dao.save(member);
    }
}
