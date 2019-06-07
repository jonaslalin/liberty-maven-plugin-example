package com.acme.pingpong;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class HelloController {
    @Inject
    private final HelloService helloService;

    @Inject
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GET
    public String hello(@QueryParam("name") String name) {
        return this.helloService.createGreeting(name);
    }
}
