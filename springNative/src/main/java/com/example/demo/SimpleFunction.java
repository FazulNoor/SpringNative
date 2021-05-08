package com.example.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class SimpleFunction implements Function<String, String>{

    @Override
    public String apply(String s) {
        return "Welcome to Spring"+s;
    }
}