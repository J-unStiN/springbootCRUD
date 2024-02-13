package com.sideproject.nerdy.domain;


import com.sideproject.nerdy.VO.ItemCategory;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.print.DocFlavor;
import java.time.LocalDateTime;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ItemCategory itemCategory;

    private String name;

    private int price;

    @CreationTimestamp
    private LocalDateTime createdTime;
}
