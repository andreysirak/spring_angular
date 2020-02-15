package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import javax.persistence.GeneratedValue;


public class AppConstants {

    @Autowired
    private Environment env;


    //@Value("${APP_DEMO2_LINK}")
//    public static String APP_DEMO2_LINK = env.getProperty("APP_DEMO2_LINK");
    public static String APP_DEMO2_LINK = "http://localhost:8080/";


}
