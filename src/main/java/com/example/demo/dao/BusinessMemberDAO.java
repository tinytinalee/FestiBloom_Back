package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.BusinessMember;

public interface BusinessMemberDAO extends JpaRepository<BusinessMember, String> {
    
}