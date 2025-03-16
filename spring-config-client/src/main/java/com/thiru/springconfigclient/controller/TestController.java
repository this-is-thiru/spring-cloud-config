package com.thiru.springconfigclient.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${hello.world}")
    private String greet1;

    @Value("${super.world}")
    private String greet2;

    @GetMapping("/test")
    public String test() {
        return name + "," + greet1 + "," + greet2;
    }

}
