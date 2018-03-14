package com.switchfully.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.inject.Inject;

@SpringBootApplication
public class Application implements CommandLineRunner {

    static ApplicationContext context;

    @Inject
    public Application(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TaxCalculator calculator = Application
                .context
                .getBean(TaxCalculator.class);
        double result = calculator.calculateTax(100000);
        System.out.println("For an annual income of 100k you have to pay :");
        System.out.println(result + " USD if you live in the US!");
    }

}
