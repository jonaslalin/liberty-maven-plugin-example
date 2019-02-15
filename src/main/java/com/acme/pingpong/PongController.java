package com.acme.pingpong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pong")
@Produces(MediaType.TEXT_PLAIN)
public class PongController {
    @GET
    public String pong() {
        return "Ping";
    }
}
