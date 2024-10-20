package com.learning.FlightTranscation.repository;

import com.learning.FlightTranscation.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
