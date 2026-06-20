package com.javafse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingApp {

    /*
        A Logger object
        - logger calls error and warns
    */
    private static final Logger logger = LoggerFactory.getLogger(LoggingApp.class);

    public static void main(String[] args) {
        logger.error("This is an error message.");
        logger.warn("This is a warning message.");
    }
}