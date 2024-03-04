package com.sideproject.nerdy.domain;

import com.sideproject.nerdy.VO.OrderCredit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Builder
@Getter
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item itemId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberId;

    private String itemForYou;

    private String address;

    @Column(length = 11)
    private String phoneNumber;

    private int totalPrice;

    private String orderMemo;

    @Enumerated(EnumType.STRING)
    private OrderCredit orderCredit;

    @CreationTimestamp
    private LocalDateTime createdTime;

    protected Order() {

    }

}
