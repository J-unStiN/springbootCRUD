package com.sideproject.nerdy.dto.req;


public record CreatedUserRequestDto(
        String email,
        String password,
        String nickName,
        String name,
        String address
) {
}
