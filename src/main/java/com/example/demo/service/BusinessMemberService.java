package com.example.demo.service;

import com.example.demo.dao.BusinessMemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessMemberService {

    @Autowired
    private BusinessMemberDAO repository;

    public boolean isIdAvailable(String bMemId) {

        return !repository.existsBybMemId(bMemId);
    }
}
