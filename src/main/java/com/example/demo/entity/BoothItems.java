package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Booth_Items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoothItems {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_no")
    @SequenceGenerator(name = "seq_item_no", sequenceName = "seq_item_no", allocationSize = 1)
    @Column(name = "item_no")
    private int itemNo;

    @Column(name = "booth_name")
    private String boothName;
   
    @Column(name = "item_name")
    private String itemName;
   
    @Column(name = "item_info")
    private String itemInfo;
   
    @Column(name = "festival_no")
    private int festivalNo;
   
    @Column(name = "item_price")
    private int itemPrice;
}