package com.kindsonthegenius.rabbitmqdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication {

    private final static String QUEUE_NAME = "hello";

    static Logger logger
			= (Logger) LoggerFactory.getLogger(RabbitmqdemoApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(RabbitmqdemoApplication.class, args);
    }

}
