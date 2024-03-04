package com.sideproject.nerdy.dto.req;

public record LoginRequestDto(
        String email,
        String password
) {
}
