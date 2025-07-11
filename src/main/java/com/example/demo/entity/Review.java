package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Review")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_review_no")
    @SequenceGenerator(name = "seq_review_no", sequenceName = "seq_review_no", allocationSize = 1)
    @Column(name = "review_no")
    private Long reviewNo;

    @Column(name = "review_title")
    private String reviewTitle;

    @Column(name = "review_content")
    private String reviewContent;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reviewCreated = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "review_updated")
    private Date reviewUpdated;

    @Column(name = "festival_no")
    private Long festivalNo;

    @Column(name = "c_mem_id")
    private String cMemId;
}