package com.kevin.springbootuse;

import lombok.extern.slf4j.Slf4j;
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

    @ExceptionHandler(Exception.class)
    public HttpResponse exception(Exception exception) {
        log.warn("Exception------------------->");
        return HttpResponse.builder()
                .code(400)
                .msg(exception.getMessage())
                .build();
    }

}
