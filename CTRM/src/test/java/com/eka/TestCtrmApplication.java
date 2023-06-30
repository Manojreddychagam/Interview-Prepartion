package com.eka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.containers.OracleContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestCtrmApplication {

	@Bean
	@ServiceConnection
	MongoDBContainer mongoDbContainer() {
		return new MongoDBContainer("mongo:latest");
	}

	@Bean
	@ServiceConnection
	OracleContainer oracleContainer() {
		return new OracleContainer("gvenzl/oracle-xe:latest");
	}

	public static void main(String[] args) {
		SpringApplication.from(CtrmApplication::main).with(TestCtrmApplication.class).run(args);
	}

}
