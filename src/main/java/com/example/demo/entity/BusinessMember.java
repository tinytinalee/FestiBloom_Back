package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Business_Member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessMember {

    @Id
    @Column(name = "b_mem_id")
    @JsonProperty("bMemId")
    private String bMemId;

    @Column(name = "b_mem_pwd")
    @JsonProperty("bMemPwd")
    private String bMemPwd;

    @Column(name = "b_mem_name")
    @JsonProperty("bMemName")
    private String bMemName;

    @Column(name = "b_mem_phone")
    @JsonProperty("bMemPhone")
    private String bMemPhone;

    @Column(name = "b_mem_email")
    @JsonProperty("bMemEmail")
    private String bMemEmail;

}