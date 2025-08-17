package com.lx.codeGenerate.exception;

import com.lx.codeGenerate.utils.Response;
import com.lx.codeGenerate.utils.ResultUtil;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Hidden
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public Response<?> businessExceptionHandler(BusinessException e) {
        log.error(e.getMessage(), e);
        return ResultUtil.error(e.getCode(), e.getMessage());
    }
    @ExceptionHandler(RuntimeException.class)
    public Response<?> exceptionHandler(RuntimeException e) {
        log.error(e.getMessage(), e);
        return ResultUtil.error(ErrorCode.SYSTEM_ERROR,"系统错误");
    }
}
