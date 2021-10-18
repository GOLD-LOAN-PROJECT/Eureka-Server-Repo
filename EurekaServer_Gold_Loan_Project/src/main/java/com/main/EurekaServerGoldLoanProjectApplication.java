package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerGoldLoanProjectApplication {

	public static void main(String[] args) {
		System.out.println("eureka server");
		SpringApplication.run(EurekaServerGoldLoanProjectApplication.class, args);
	}

}
