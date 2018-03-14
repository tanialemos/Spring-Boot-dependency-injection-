package com.switchfully.domain;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.inject.Inject;

@SpringBootApplication
public class Application {

    private final ApplicationContext context;

    @Inject
    public Application(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {

    }
}
