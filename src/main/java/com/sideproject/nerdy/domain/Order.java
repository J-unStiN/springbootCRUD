package com.sideproject.nerdy.domain;

import com.sideproject.nerdy.VO.OrderCredit;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private List<Item> item;

    @OneToOne
    private Member memberId;


    private String toName;

    private String address;

    private String phoneNumber;

    private int totalPrice;

    private String orderContents;

    @Enumerated(EnumType.STRING)
    private OrderCredit orderCredit;


    @CreationTimestamp
    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;






}
