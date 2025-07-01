package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Customer_Member")
public class CustomerMember {

    @Id
    private String c_mem_id;

    private String c_mem_pwd;
    private String c_mem_name;
    private String c_mem_email;
    private String c_mem_phone;
}