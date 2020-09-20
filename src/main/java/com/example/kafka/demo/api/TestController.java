package com.example.kafka.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/test", produces = "application/json", consumes = "application/json")
    public String response() {
        return "Hello, World!";
    }
}
