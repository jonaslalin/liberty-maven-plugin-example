package com.acme.pingpong;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
