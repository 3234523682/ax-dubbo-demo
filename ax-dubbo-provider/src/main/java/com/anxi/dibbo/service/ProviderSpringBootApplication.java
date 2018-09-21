package com.anxi.dibbo.service;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author linjing
 */
@SpringBootApplication
public class ProviderSpringBootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderSpringBootApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
