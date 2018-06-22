package com.example.demo;

import javax.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Entity
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.example.demo","controller","service","config"})
@EntityScan("model")
@EnableJpaRepositories(basePackages= {"repository"})

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
