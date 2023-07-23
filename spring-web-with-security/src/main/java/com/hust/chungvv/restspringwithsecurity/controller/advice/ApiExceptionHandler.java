package com.hust.chungvv.restspringwithsecurity.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleAllException(Exception ex, WebRequest request) {

        Map<String, Object> map = new HashMap<>();
        map.put("status_code", HttpStatus.INTERNAL_SERVER_ERROR.value());
        map.put("message", ex.getMessage());
        map.put("path",((ServletWebRequest) request).getRequest().getServletPath());
        return map;
    }
}