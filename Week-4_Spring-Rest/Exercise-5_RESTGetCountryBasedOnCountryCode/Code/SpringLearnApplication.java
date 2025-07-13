package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages =  "com.cognizant.spring_learn")
public class SpringLearnApplication {

	private static final Logger logg = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		logg.info("Start");
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		logg.info("end");

	}

	public static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country");
		logg.debug("Country : {}", country.toString());
	}

}
