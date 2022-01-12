package com.kevin.springbootuse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public HttpResponse methodArgumentNotValidException(MethodArgumentNotValidException exception) {
        log.warn("MethodArgumentNotValidException======>");
        return HttpResponse.builder()
                .code(400)
                .msg(exception.getMessage())
                .build();
    }

    @ExceptionHandler(BindException.class)
    public HttpResponse exception(BindException exception) {
        log.warn("BindException------------------->");
        return HttpResponse.builder()
                .code(400)
                .msg(exception.getAllErrors().stream().findFirst().orElse(new ObjectError(exception.getObjectName(), exception.getMessage())).getDefaultMessage())
                .build();
    }

}
