package com.learning.FlightTranscation.repository;

import com.learning.FlightTranscation.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
