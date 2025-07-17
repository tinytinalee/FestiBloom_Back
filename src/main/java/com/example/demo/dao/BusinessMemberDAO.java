package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BusinessMember;


@Repository
public interface BusinessMemberDAO extends JpaRepository<BusinessMember, String> {

    @Query("SELECT CASE WHEN COUNT(bm) > 0 THEN true ELSE false END " +
           "FROM BusinessMember bm " +
           "WHERE bm.bMemId = :id AND bm.bMemPwd = :pwd")
    boolean existsByIdAndPwd(@Param("id") String bMemId,
                             @Param("pwd") String bMemPwd);
    
    @Query("SELECT bm.bMemName FROM BusinessMember bm WHERE bm.bMemId = :id")
    String findNameById(@Param("id") String bMemId);
}
