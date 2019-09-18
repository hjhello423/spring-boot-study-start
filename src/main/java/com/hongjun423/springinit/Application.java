package com.hongjun423.springinit;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("========================");
                out.println("========================");
                out.println("========================");
                out.println("========================");
                out.println("set baner");
                out.println("========================");
                out.println("========================");
                out.println("========================");
            }
        });
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }


}
