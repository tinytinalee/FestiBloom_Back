package com.example.demo.dao;

import com.example.demo.entity.BusinessMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;


@Repository
public interface BusinessMemberDAO extends JpaRepository<BusinessMember, String> {

    boolean existsBybMemId(String bMemId);
}
