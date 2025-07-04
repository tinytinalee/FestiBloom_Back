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
    private Long reviewNo;

    @Column(length = 100)
    private String reviewTitle;

    @Column(length = 500)
    private String reviewContent;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reviewCreated = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    private Date reviewUpdated;

    private Long festivalNo;

    private String cMemId;

}
