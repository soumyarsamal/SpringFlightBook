package com.learning.FlightTranscation.controller;

import com.learning.FlightTranscation.dto.FlightBookingAcknowledgement;
import com.learning.FlightTranscation.dto.FlightBookingRequest;
import com.learning.FlightTranscation.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return service.bookFlight(request);
    }
}
