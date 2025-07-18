package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Booth_Items")
@Data
public class BoothItems {

    @Id
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
