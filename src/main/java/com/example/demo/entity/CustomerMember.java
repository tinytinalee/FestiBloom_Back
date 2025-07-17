package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Customer_Member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMember {

    @Id
    @Column(name = "c_mem_id")
    @JsonProperty("cMemId")
    private String cMemId;

    @Column(name = "c_mem_pwd")
    @JsonProperty("cMemPwd")
    private String cMemPwd;

    @Column(name = "c_mem_name")
    @JsonProperty("cMemName")
    private String cMemName;

    @Column(name = "c_mem_email")
    @JsonProperty("cMemEmail")
    private String cMemEmail;

    @Column(name = "c_mem_phone")
    @JsonProperty("cMemPhone")
    private String cMemPhone;
}