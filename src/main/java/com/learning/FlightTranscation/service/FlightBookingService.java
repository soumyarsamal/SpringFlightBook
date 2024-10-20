package com.learning.FlightTranscation.service;

import com.learning.FlightTranscation.dto.FlightBookingAcknowledgement;
import com.learning.FlightTranscation.dto.FlightBookingRequest;
import com.learning.FlightTranscation.entity.PassengerInfo;
import com.learning.FlightTranscation.entity.PaymentInfo;
import com.learning.FlightTranscation.repository.PassengerInfoRepository;
import com.learning.FlightTranscation.repository.PaymentInfoRepository;
import com.learning.FlightTranscation.utils.PaymentUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlight(FlightBookingRequest flightBookingRequest) {
        PassengerInfo passengerInfo = flightBookingRequest.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = flightBookingRequest.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
