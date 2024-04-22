package com.mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DepartmentServiceAss1Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceAss1Application.class, args);
	}

}
