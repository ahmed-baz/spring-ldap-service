package com.skyros.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityLdapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityLdapApplication.class, args);
    }

    @GetMapping("/")
    public String hi() {
        return "Hello";
    }


}
