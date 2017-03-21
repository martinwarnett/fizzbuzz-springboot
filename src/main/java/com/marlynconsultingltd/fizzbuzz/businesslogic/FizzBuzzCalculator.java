package com.marlynconsultingltd.fizzbuzz.businesslogic;


import java.util.stream.IntStream;

public final class FizzBuzzCalculator {

    public String calculate(final int start, final int end, final ParameterValidator validator) {
        validateParameters(validator, start, end);
        final StringBuilder text = new StringBuilder();

        IntStream.rangeClosed(start, end).forEach(i -> processNumber(i, text));

        return text.toString();
    }

    private void validateParameters(final ParameterValidator validator,
                                         final int start,
                                         final int end) {
        validator.validateParameters(start, end);
    }
    
    private void processNumber(final int number, final StringBuilder text) {
        text.append(String.format("%d : ", number));
        
        String result = "";
        if(FizzBuzzPredicates.isFizz().test(number)) {
            result = "Fizz";
        }
        if(FizzBuzzPredicates.isBuzz().test(number)) {
            result += "Buzz";
        }

        if ("".equals(result)) {
            result = Integer.toString(number);
        }
        
        text.append(String.format("%s<br/>", result));
    }
}
