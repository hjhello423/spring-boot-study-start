package com.hongjun423.springinit;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .banner(new Banner() {
                    @Override
                    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                        out.println("***************");
                        out.println("***************");
                        out.println("banner ----");
                        out.println("***************");
                        out.println("***************");
                    }
                })
                .run();

    }


}
