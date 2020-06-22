package com.qzing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qzing.service.EchoService;

@RestController
public class ConsumerController {
    @Autowired
    private EchoService echoService;

    @GetMapping("/hi-feign")
    public String hiFeign(){
       return echoService.hi("feign");
    }
}
