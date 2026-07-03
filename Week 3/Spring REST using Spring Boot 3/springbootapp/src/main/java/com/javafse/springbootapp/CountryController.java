package com.javafse.springbootapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CountryController {
    
    /*
        Loading application context from XML configuration
    */
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    /*
        Mapping GET request to /country
        Retrieves the country bean with ID 'in'
    */
    @GetMapping("/country")
    public Country getCountryIndia() {
        return (Country) context.getBean("in");
    }

    /*
        Mapping GET request to /country/{code}
        Dynamically retrieves the country bean based on the path variable
    */
    @RequestMapping("/country/{code}")
    public Country requestMethodName(@PathVariable String code) {
        return (Country) context.getBean(code);
    }
}