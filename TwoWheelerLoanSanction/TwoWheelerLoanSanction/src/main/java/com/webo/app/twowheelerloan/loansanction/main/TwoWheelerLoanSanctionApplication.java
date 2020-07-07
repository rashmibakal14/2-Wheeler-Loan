package com.webo.app.twowheelerloan.loansanction.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
@EnableEurekaClient
public class TwoWheelerLoanSanctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanSanctionApplication.class, args);
	}

}
