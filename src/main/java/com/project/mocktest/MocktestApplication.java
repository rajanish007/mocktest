package com.project.mocktest;

import com.project.mocktest.constant.MockConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MocktestApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(MocktestApplication.class, args);
	}

	@Bean(name = MockConstants.LOG_QUALIFIER)
	public Logger getLogger(){
		return LoggerFactory.getLogger(MockConstants.LOG_QUALIFIER);
	}

}
