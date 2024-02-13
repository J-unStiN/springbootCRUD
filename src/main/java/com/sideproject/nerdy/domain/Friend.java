package com.sideproject.nerdy.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberMe;

    @ManyToOne
    @JoinColumn(name = "friend_member_id")
    private Member friendMember;

    @CreationTimestamp
    private LocalDateTime createdTime;

}
