package com.lx.utils;

import com.lx.exception.ErrorCode;

public class ResultUtil {

    public static <T> Response<T> success(T data) {
        return new Response<>(0, "success", data);
    }

    public static Response<?> error(ErrorCode errorCode) {
        return new Response<>(errorCode);
    }

    public static Response<?> error(int code, String message) {
        return new Response<>(code, message);
    }

    public static Response<?> error(ErrorCode errorCode, String message) {
        return new Response<>(errorCode.getCode(), message);
    }
}
