package com.javafse.springbootapp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        displayCountries();
    }

    @SuppressWarnings("unchecked")
    public static void displayCountries() {
        LOGGER.debug("START");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        LOGGER.debug("{}", countries);
        context.close();
        LOGGER.debug("END");
    }
}