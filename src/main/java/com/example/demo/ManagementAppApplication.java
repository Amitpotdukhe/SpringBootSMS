package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.controller", "com.example.services"})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repo")
public class ManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementAppApplication.class, args);
	}

}
