package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
public class SayHi {
    public String say() {
        return "Say Hi.";
    }
}
