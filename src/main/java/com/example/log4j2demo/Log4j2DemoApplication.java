package com.example.log4j2demo;

/*
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
*/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Log4j2DemoApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(Log4j2DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
		};
	}
*/	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Debugging log from Log4j2DemoApplication");
        logger.info("Info log from Log4j2DemoApplication");
        logger.warn("Hey, This is a warning! from Log4j2DemoApplication");
        logger.error("Oops! We have an Error. OK from Log4j2DemoApplication");
        logger.fatal("Damn! Fatal error. Please fix me. from Log4j2DemoApplication");
    }

}
