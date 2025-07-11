package com.example.demo.dao;

import com.example.demo.entity.CustomerMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerMemberDAO extends JpaRepository<CustomerMember, String> {
	
	//'CustomerMember'; Did you mean 'cMemId','CMemId'
    boolean existsBycMemId(String cMemId);
}
