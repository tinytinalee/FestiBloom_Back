package com.example.demo.dao;

import com.example.demo.entity.CustomerMember;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface CustomerMemberDAO extends JpaRepository<CustomerMember, String> {
    
//    boolean existsByCMemIdAndCMemPwd(String cMemId, String cMemPwd);
    @Query("SELECT CASE WHEN COUNT(cm) > 0 THEN true ELSE false END " +
           "FROM CustomerMember cm " +
           "WHERE cm.cMemId = :id AND cm.cMemPwd = :pwd")
    boolean existsByIdAndPwd(@Param("id") String cMemId,
                             @Param("pwd") String cMemPwd);
    
    @Query("SELECT cm.cMemName FROM CustomerMember cm WHERE cm.cMemId = :id")
    String findNameById(@Param("id") String cMemId);

    // existsById 자동 제공됨

}
