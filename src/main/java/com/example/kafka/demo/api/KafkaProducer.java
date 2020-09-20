package com.example.kafka.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> template;

    @PostMapping(value = "produce", produces = "application/json", consumes = "application/json")
    public String produce(@RequestBody String body) {
        try {
            this.template.send("myTopic", body);
            return "Successful";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failure";
        }
    }
}
