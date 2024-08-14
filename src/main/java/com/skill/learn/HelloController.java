package com.skill.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String text = "Hello, %s!";

    @GetMapping(value = "/welcome")
    public Hello welcome() {
        return new Hello("Hello Spring boot");
    }

    @PostMapping("/welcome")
    public Hello welcomeName(@RequestBody Hello name) {
        return new Hello(String.format(text,name.name()));
    }
}
