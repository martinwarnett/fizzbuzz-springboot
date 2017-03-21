package com.marlynconsultingltd.fizzbuzz.businesslogic;

public final class ParameterValidator {

    private static final String END_PARAMETER_NOT_GREATER_THAN_START = "The start parameter must be greater than the parameter - start was '%d' and end was '%d'";

    public void validateParameters(final int start, final int end) {
        if (end <= start) {
            throw new IllegalArgumentException(
                    String.format(END_PARAMETER_NOT_GREATER_THAN_START, start, end));
        }
    }
}
