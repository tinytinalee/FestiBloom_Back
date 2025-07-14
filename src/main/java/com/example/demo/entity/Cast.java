package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cast")
@Data
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cast_seq_gen")
    @SequenceGenerator(name = "cast_seq_gen", sequenceName = "seq_cast_no", allocationSize = 1)
    @Column(name = "cast_no")
    private int castNo;

    @Column(name = "cast_name")
    private String castName;

    @Column(name = "cast_info")
    private String castInfo;

    @Column(name = "cast_time")
    private String castTime;

    @Column(name = "festival_no")
    private int festivalNo;
}
