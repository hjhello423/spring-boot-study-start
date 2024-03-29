package com.hongjun423.springinit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { // 기본 resourceHandler 유지하면서 추가
        registry.addResourceHandler("/m/**")
                .addResourceLocations("classpath:/m/") // '/'으로 끝나도록
                .setCachePeriod(20);

    }
}
