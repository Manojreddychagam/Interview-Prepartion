package com.eka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.eka")
public class CtrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtrmApplication.class, args);
		System.out.println("Test");
	}

}
