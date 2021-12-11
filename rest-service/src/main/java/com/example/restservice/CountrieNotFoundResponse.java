package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class CountrieNotFoundResponse {

    @ResponseBody
    @ExceptionHandler(CountrieNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String countrieNotFoundHandler(CountrieNotFoundException exception){
        return exception.getMessage();
    }
}
