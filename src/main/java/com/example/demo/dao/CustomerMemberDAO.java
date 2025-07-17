package com.example.demo.dao;

import com.example.demo.entity.CustomerMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerMemberDAO extends JpaRepository<CustomerMember, String> {
    // existsById 자동 제공됨
}
