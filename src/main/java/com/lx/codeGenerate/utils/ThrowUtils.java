package com.lx.codeGenerate.utils;

import com.lx.codeGenerate.exception.BusinessException;
import com.lx.codeGenerate.exception.ErrorCode;

public class ThrowUtils {

    public static void throwIf(Boolean condition, RuntimeException exception) {
        if (condition) {
            throw exception;
        }
    }

    public static void throwIf(Boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(Boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
