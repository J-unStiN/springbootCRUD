package com.sideproject.nerdy.domain;

import com.sideproject.nerdy.VO.AuthType;
import jakarta.persistence.*;

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private AuthType authType;

}
