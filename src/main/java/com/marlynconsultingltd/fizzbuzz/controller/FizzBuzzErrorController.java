package com.marlynconsultingltd.fizzbuzz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class FizzBuzzErrorController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)  
    @ExceptionHandler(value = Exception.class)  
    public String handleException(final Exception e){
        return String.format("<H1>FizzBuzz Error</H1><br/>%s",e.getMessage());
    } 
    
}
