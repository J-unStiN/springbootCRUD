package com.sideproject.nerdy.domain;


import com.sideproject.nerdy.VO.AuthType;
import com.sideproject.nerdy.VO.MemberStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String nickname;

    private String email;

    private String address;

    @Enumerated(EnumType.STRING)
    private AuthType authType;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
//    private List<Board> boardList;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @UpdateTimestamp
    private LocalDateTime updatedTime;
}
