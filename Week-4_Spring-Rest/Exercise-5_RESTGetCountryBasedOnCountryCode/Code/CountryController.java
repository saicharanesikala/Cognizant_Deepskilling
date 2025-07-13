package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController 
{

    Logger logg = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService cs   = new CountryService();

    @GetMapping("/country")
    public Country getCountryIndia(){

        logg.info("Inside getCountryIndia");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country", Country.class);
        return country;
    }

    @GetMapping("/country/{code}")
    public Country getCountryById(@PathVariable String code){
        Country country = cs.getCountry(code);

        return country;
    }

}
