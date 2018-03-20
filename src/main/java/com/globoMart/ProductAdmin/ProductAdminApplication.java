package com.globoMart.ProductAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProductAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAdminApplication.class, args);
	}
}
