package com.skill.learn;

public record Hello(String name) {

    public Hello {
        if (name.isEmpty()) {
            name = "World";
        }
    }
}
