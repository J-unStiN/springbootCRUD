package com.sideproject.nerdy.common.exception;

public record ExceptionResDto(
        String httpStatus,
        Object object
) {


}
