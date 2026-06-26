package com.javafse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javafse.service.BookService;

public class Main {
    public static void main(String[] args) {
        /*
            Getting context from 'applicationContext.xml' using spring-context
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*
            Retrieving BookService bean
        */
        BookService bookService = context.getBean("bookService", BookService.class);

        /*
            Executing targeted methods
        */
        bookService.addBook("\'Unknown\'");
    }
}