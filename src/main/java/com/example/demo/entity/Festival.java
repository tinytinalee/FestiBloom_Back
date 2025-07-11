package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "Festival")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "festival_no")
    private int festivalNo;

    @Column(name = "festival_name")
    private String festivalName;
   
    @Column(name = "festival_start")
    private Date festivalStart;
    
    @Column(name = "festival_end")
    private Date festivalEnd;
    
    @Column(name = "festival_loc")
    private String festivalLoc;
    
    @Column(name = "festival_place")
    private String festivalPlace;
    
    @Column(name = "festival_genre")
    private String festivalGenre;
    
    @Column(name = "festival_price")
    private int festivalPrice;
    
    @Column(name = "festival_img")
    private String festivalImg;
    
    @Column(name = "festival_detail")
    private String festivalDetail;
    
    @Column(name = "festival_link")
    private String festivalLink;
    
    @Column(name = "b_mem_id")
    private String bMemId;
}