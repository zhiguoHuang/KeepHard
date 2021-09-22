package com.guo.keepHard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class CrossConfig extends WebMvcConfigurationSupport {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
       registry.addMapping("/*")
               .allowedOrigins("*")
               .allowedHeaders("*")
               .allowCredentials(true);
    }


}
