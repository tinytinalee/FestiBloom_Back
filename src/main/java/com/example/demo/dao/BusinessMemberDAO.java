package com.example.demo.dao;

import com.example.demo.entity.BusinessMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessMemberDAO extends JpaRepository<BusinessMember, String> {
    // existsById 자동 제공됨
}
