 package com.example.BabaFoodServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer

public class BabaFoodServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabaFoodServerApplication.class, args);
	}

}
