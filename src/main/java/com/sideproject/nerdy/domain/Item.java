package com.sideproject.nerdy.domain;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.print.DocFlavor;
import java.time.LocalDateTime;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private ItemCategory itemCategory;

    private String name;

    private int price;

    @CreationTimestamp
    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;

}
