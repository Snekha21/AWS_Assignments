package com.crudapp.trainingmanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")  // Allow all for now, secure later!
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
