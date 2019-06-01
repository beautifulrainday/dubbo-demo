package com.example.dubboconsumer.controller;

import com.example.dubboconsumer.service.DubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboConsumerController {

    @Autowired
    private DubboConsumerService dubboConsumerService;

    @GetMapping(value = "testDubbo")
    public String testDubbo() {
        return dubboConsumerService.helloDubbo();
    }
}
