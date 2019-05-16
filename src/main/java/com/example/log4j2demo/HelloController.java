package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index() {
        logger.debug("Debugging log from HelloController");
        logger.info("Info log from HelloController");
        logger.warn("Hey, This is a warning! from HelloController");
        logger.error("Oops! We have an Error. OK from HelloController");

        return "Greetings from Spring Boot HelloController!";
    }
    
}
