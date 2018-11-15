package com.example.streamhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StreamHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamHelloApplication.class, args);
    }
}
