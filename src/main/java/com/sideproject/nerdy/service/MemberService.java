package com.sideproject.nerdy.service;

import com.sideproject.nerdy.domain.Member;
import com.sideproject.nerdy.dto.req.CreatedUserRequestDto;
import com.sideproject.nerdy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createdMember(CreatedUserRequestDto createdUserRequestDto) {

        Member createMember = Member.builder()
                .name(createdUserRequestDto.name())
                .email(createdUserRequestDto.email())
                .password(createdUserRequestDto.password())
                .address(createdUserRequestDto.address())
                .nickname(createdUserRequestDto.nickName())
                .build();

        Member save = memberRepository.save(createMember);

        return save;
    }



}
