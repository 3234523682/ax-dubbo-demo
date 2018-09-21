package com.anxi.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author linjing
 */
@SpringBootApplication(scanBasePackages = "com.anxi.dubbo.controller")
public class ConsumerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringBootApplication.class, args);
    }
}
