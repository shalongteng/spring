package com.slt.spring.javaeeBook.config;

import com.slt.spring.javaeeBook.model.Axe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Axe axe(){
        return new Axe();
    }
}
