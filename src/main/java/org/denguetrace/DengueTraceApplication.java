package org.denguetrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DengueTraceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DengueTraceApplication.class, args);
    }
}