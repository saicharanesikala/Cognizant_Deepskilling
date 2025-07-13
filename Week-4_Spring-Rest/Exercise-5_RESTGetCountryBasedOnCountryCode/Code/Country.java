package com.cognizant.spring_learn;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {

    private String code;
    private String name;
    Logger logg = LoggerFactory.getLogger(Country.class);

    public Country(){
        logg.debug("Inside Country constructor");
    }

    public void setCode(String code){
       logg.debug("Inside Country setCode");
       this.code=code;
    }

    public void setName(String name){
        logg.debug("Inside Country setName");
        this.name=name;
    }

    public String getCode(){
        logg.debug("Inside Country getCode");
        return this.code;
    }

    public String getName(){
        logg.debug("Inside Country getName");
        return this.name;
    }

    @Override
    public String toString(){
        return "Country "+this.name+" "+this.code;
    }

}
