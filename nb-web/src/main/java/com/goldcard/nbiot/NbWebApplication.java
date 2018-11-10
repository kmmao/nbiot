package com.goldcard.nbiot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class NbWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbWebApplication.class, args);
    }
}
