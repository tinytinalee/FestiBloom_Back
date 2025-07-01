package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Business_Member")
public class BusinessMember {

    @Id
    private String b_mem_id;

    private String b_mem_pwd;
    private String b_mem_name;
    private String b_mem_email;
    private String b_mem_phone;
}