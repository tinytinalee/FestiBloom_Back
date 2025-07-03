package com.example.demo.dao;

import com.example.demo.entity.BusinessMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessMemberDAO extends JpaRepository<BusinessMember, String> {
    boolean existsByBmemId(String bMemId);
}
