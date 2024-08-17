package com.skill.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String TEXT = "Hello, %s!";
    private Hello hello;

    @Autowired
    public HelloController(Hello hello) {
        this.hello = hello;
    }

    @GetMapping(value = "/welcome")
    public Hello welcome() {
        return new Hello("Hello Spring boot");
    }

    @PostMapping("/welcome")
    public Hello welcomeName(@RequestBody Hello name) {
        return new Hello(String.format(TEXT,name.name()));
    }
}
