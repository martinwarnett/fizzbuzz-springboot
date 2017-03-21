package com.marlynconsultingltd.fizzbuzz.controller;

import com.marlynconsultingltd.fizzbuzz.businesslogic.FizzBuzzCalculator;
import com.marlynconsultingltd.fizzbuzz.businesslogic.ParameterValidator;
import javax.ws.rs.QueryParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class FizzBuzzController {
    
    @RequestMapping("/fizzbuzz")
    public String calculateFizzBuzz(@QueryParam("start") final int start, @QueryParam("end") final int end) {
        final StringBuilder text = new StringBuilder();
        
        text.append(new FizzBuzzCalculator().calculate(start, end, new ParameterValidator()));
        return text.toString();   
    }
}
