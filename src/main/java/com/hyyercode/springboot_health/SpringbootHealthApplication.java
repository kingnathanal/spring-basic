package com.hyyercode.springboot_health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringbootHealthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHealthApplication.class, args);
    }

}
