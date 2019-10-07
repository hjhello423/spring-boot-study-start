package com.hongjun423.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    private String hello;

    @Autowired
    private MyProperties myProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.warn("============================");
        logger.info(hello);
        logger.debug(myProperties.getName());
        logger.info(myProperties.getFullName());
        logger.warn("============================");

    }
}
