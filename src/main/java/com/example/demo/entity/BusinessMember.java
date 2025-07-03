package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "Business_Member")
public class BusinessMember {

    @Id
    @Column(name = "b_mem_id")
    private String bMemId;

    @Column(name = "b_mem_pwd")
    private String bMemPwd;

    @Column(name = "b_mem_name")
    private String bMemName;

    @Column(name = "b_mem_email")
    private String bMemEmail;

    @Column(name = "b_mem_phone")
    private String bMemPhone;
}
