package com.hyyercode.springboot_health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() { return "You made it here"; }

    // create a get mapping for health check
    @GetMapping("/health")
    public String healthCheck() {
        return "Application is up and running";
    }

}
