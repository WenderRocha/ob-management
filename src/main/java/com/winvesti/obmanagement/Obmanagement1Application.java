package com.winvesti.obmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.winvesti.obmanagement.model")
public class Obmanagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(Obmanagement1Application.class, args);
	}

}
