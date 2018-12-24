package com.xiao.xaiosc.scback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class ScBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScBackApplication.class, args);
    }

}

