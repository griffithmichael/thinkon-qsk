package com.example.thinkon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example")
public class ThinkonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkonApplication.class, args);
	}

}
