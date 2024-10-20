package com.learning.FlightTranscation.utils;

import com.learning.FlightTranscation.exception.InsufficientBalance;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1", 13000.00);
        paymentMap.put("acc2", 8000.00);
        paymentMap.put("acc3", 12000.00);
        paymentMap.put("acc4", 15000.00);
    }

    public static boolean validateCreditLimit(String accountNumber, Double paidAmount) throws InsufficientBalance {
        if (paidAmount > paymentMap.get(accountNumber)) {
            throw new InsufficientBalance("Insufficient Balance");
        } else {
            return true;
        }
    }
}
