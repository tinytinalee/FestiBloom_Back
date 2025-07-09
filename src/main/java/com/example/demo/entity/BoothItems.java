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
    private int item_no;

    private String booth_name;
    private String item_name;
    private String item_info;
    private int festival_no;
    private int item_price;
}
