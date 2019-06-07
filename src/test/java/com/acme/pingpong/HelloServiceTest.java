package com.acme.pingpong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloServiceTest {
    private final HelloService helloService = new HelloService();

    @Test
    public void shouldSayHi() {
        assertEquals("Hello, World!", this.helloService.createGreeting("World"));
    }
}
