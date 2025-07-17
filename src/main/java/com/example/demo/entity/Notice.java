package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notice")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_no")
    private int noticeNo;

    @Column(name = "notice_title")
    private String noticeTitle;
   
    @Column(name = "notice_content")
    private String noticeContent;
    
    @Column(name = "notice_created")
    private Date noticeCreated;
    
    @Column(name = "notice_updated")
    private Date noticeUpdated;
    
    @Column(name = "festival_no")
    private int festivalNo;
    
}
