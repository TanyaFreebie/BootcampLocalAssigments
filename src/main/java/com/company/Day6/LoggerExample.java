package com.company.Day6;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggerExample {
    private static final Logger logger = LogManager.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        String message = "blah blah blah";
        System.out.println(message);
        logger.info(message);
    }
}
