package com.acme.pingpong;

import static org.junit.Assert.assertEquals;
import java.net.URL;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class PingControllerIT {
    @ArquillianResource
    private URL baseUrl;

    @Deployment(testable = false)
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(
                WebArchive.class,
                PingControllerIT.class.getName() + ".war")
                .addClasses(
                        PingPongApplication.class,
                        PingController.class);
    }

    @Test
    public void shouldReplyWithPong() {
        final Client client = ClientBuilder.newClient();
        final String response = client.target(baseUrl.toExternalForm())
                .path("ping")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
        client.close();
        assertEquals("Pong", response);
    }
}
