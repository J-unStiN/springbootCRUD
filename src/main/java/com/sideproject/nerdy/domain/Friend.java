package com.sideproject.nerdy.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberMe;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member FriendMember;


    @CreationTimestamp
    @Column(name = "created_time")
    private LocalDateTime createdTime;

}
