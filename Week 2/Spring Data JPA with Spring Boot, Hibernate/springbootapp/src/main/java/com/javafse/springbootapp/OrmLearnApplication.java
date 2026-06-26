package com.javafse.springbootapp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javafse.springbootapp.model.Country;
import com.javafse.springbootapp.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {
    private static CountryService countryService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootappApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testGetAllCountries();
    }

    public static void testGetAllCountries() {
        LOGGER.info("Processing country data...");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.info("Country={}", countries);
        LOGGER.info("Completed!");
    }
}
