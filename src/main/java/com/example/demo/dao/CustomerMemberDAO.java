package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CustomerMember;

public interface CustomerMemberDAO extends JpaRepository<CustomerMember, String> {
	
}