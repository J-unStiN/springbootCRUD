package com.sideproject.nerdy.domain;


import com.sideproject.nerdy.VO.AuthType;
import com.sideproject.nerdy.VO.MemberStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_id")
    private Authority authorityId;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false, length = 20)
    private String password;
    @Column(nullable = false, length = 12)
    private String nickname;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, length = 11, name = "phone_number")
    private String phoneNumber;
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "member_status")
    private MemberStatus memberStatus;

    @CreationTimestamp
    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;





}
