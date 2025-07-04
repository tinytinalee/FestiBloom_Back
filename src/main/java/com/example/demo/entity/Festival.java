package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Festival")
public class Festival {

	@Id
	private int festival_no;
	
	private String festival_name;
	private Date festival_start;
	private Date festival_end;
	private String festival_loc;
	private String festival_place;
	private String festival_genre;
	private int price;
	private String festival_img;
	private String festival_detail;
	private String festival_link;
	
	private String b_mem_id;
	
}
