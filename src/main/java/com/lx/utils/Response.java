package com.lx.utils;

import com.lx.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Response<T> implements Serializable {
    private int code;

    private String message;

    private T data;


    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(int code, T data) {
        this(code,"",data);
    }

    public Response(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getMessage());
    }
}
