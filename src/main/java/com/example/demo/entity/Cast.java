package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "LINE_UP")
@Data
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cast_seq_gen")
    @SequenceGenerator(name = "cast_seq_gen", sequenceName = "seq_cast_no", allocationSize = 1)
    @Column(name = "cast_no")
    private int castNo;

    @Column(name = "cast_name")
    private String castName;

    @Column(name = "cast_date")
    private LocalDate castDate; // DATE 타입에 맞게 LocalDate 사용

    @Column(name = "festival_no")
    private int festivalNo;
}
