package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "Customer_Member")
public class CustomerMember {

    @Id
    @Column(name = "c_mem_id")
    private String cMemId;

    @Column(name = "c_mem_pwd")
    private String cMemPwd;

    @Column(name = "c_mem_name")
    private String cMemName;

    @Column(name = "c_mem_email")
    private String cMemEmail;

    @Column(name = "c_mem_phone")
    private String cMemPhone;
}