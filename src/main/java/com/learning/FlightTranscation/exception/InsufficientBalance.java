package com.learning.FlightTranscation.exception;

public class InsufficientBalance extends RuntimeException {
    public InsufficientBalance(String msg) {
        super(msg);
    }
}
