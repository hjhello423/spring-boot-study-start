package com.hongjun423.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    MyProperties myProperties;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============================");
        System.out.println(myProperties.getName() + ", " + myProperties.getAge());
        System.out.println(myProperties.getFullName());
        System.out.println(myProperties.getSessionTimeout());
        System.out.println("============================");

    }
}