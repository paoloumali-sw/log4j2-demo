package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {

    private static final Logger logger = LogManager.getLogger(WelcomeController.class);

    @RequestMapping("/")
    public String index() {
        
        logger.debug("Debugging log from WelcomeController");
        logger.info("Info log from WelcomeController");
        logger.warn("Hey, This is a warning! from WelcomeController");
        logger.error("Oops! We have an Error. OK from WelcomeController");

        return "Greetings from Spring Boot WelcomeController!";
    }
    
}
