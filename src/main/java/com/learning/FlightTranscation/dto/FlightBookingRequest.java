package com.learning.FlightTranscation.dto;

import com.learning.FlightTranscation.entity.PassengerInfo;
import com.learning.FlightTranscation.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;


}
