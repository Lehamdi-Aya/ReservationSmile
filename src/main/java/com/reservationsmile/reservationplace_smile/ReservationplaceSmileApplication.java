package com.reservationsmile.reservationplace_smile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class ReservationplaceSmileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationplaceSmileApplication.class, args);
	}

}
