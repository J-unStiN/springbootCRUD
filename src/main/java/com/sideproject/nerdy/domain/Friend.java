package com.sideproject.nerdy.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@AllArgsConstructor
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

    protected Friend() {

    }
}
