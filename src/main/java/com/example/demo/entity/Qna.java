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
@Table(name = "Qna")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Qna {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qna_no")
    private int qnaNo;

    @Column(name = "qna_title")
    private String qnaTitle;
   
    @Column(name = "qna_content")
    private String qnaContent;
    
    @Column(name = "qna_created")
    private Date qnaCreated;
    
    @Column(name = "qna_updated")
    private Date qnaUpdated;
    
    @Column(name = "qna_answer")
    private String qnaAnswer;
    
    @Column(name = "festival_no")
    private int festivalNo;
    
    @Column(name = "c_mem_id")
    private String cMemId;
}
