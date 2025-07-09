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
    private int festival_no;

    private String festival_name;
    private Date festival_start;
    private Date festival_end;
    private String festival_loc;
    private String festival_place;
    private String festival_genre;
    private int festival_price;
    private String festival_img;
    private String festival_detail;
    private String festival_link;
    private String b_mem_id;
}
