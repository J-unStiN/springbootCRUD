package com.sideproject.nerdy.controller;

import com.sideproject.nerdy.domain.Member;
import com.sideproject.nerdy.dto.req.CreatedUserRequestDto;
import com.sideproject.nerdy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/member")
    public ResponseEntity<?> createdMember(@RequestBody CreatedUserRequestDto createdUserRequestDto) {

        Member saveMember = memberService.createdMember(createdUserRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("회원가입이 완료되었습니다. || " + saveMember.getEmail());
    }
}
