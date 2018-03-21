package com.example.weektwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class WeektwoApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeektwoApplication.class, args);
	}
}


