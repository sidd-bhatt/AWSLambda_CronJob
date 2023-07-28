package com.lambda.cronjob;

import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());
    public String handleRequest(){
        logger.info("Hello World is running");
        return "Hello World is running";
    }
}
