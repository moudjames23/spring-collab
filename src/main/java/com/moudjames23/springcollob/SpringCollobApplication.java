package com.moudjames23.springcollob;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCollobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCollobApplication.class, args);
    }

    @Bean
    ModelMapper modelMapper() {
        return  new ModelMapper();
    }
}
