package com.hotelserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelservApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelservApplication.class, args);
	}

}
