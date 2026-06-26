package com.javafse.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootappApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootappApplication.class);

	public static void main(String[] args) {
		/*
			Verfies Logger works!
		*/
		SpringApplication.run(SpringbootappApplication.class, args);
		LOGGER.info("SpringBoot Application: main()");
	}
}
