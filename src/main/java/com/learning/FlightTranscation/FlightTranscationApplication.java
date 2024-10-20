package com.learning.FlightTranscation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FlightTranscationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTranscationApplication.class, args);
	}

}
