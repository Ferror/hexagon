package presenter.rest.http;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import presenter.rest.controller.FakeAction;
import presenter.rest.controller.RouteNotFoundAction;

public class RoutingTest
{
    @Test
    public void testItFindsRouting()
    {
        Routing routing = new Routing();

        Assertions.assertThrows(Exception.class, () -> routing.findAction("path", "GET"));

        routing.addRouting("/test", "GET", new FakeAction());
        routing.addRouting("/another", "GET", new RouteNotFoundAction());
        routing.addRouting("/another", "POST", new FakeAction());

        try {
            Assertions.assertTrue(routing.findAction("/test", "GET") instanceof FakeAction);
            Assertions.assertTrue(routing.findAction("/another", "POST") instanceof FakeAction);
            Assertions.assertTrue(routing.findAction("/another", "GET") instanceof RouteNotFoundAction);
        } catch (Exception exception) {
            Assertions.fail("exception");
        }
    }
}
