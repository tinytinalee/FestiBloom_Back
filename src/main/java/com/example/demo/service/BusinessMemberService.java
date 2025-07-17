package com.example.demo.service;

import com.example.demo.dao.BusinessMemberDAO;
import com.example.demo.entity.BusinessMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessMemberService {

    @Autowired
    private BusinessMemberDAO businessMemberDAO;

    public boolean isIdDuplicate(String bMemId) {
        return businessMemberDAO.existsById(bMemId);
    }

    public void join(BusinessMember business) {
        businessMemberDAO.save(business);
    }
}
