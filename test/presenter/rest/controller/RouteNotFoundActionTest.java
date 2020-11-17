package presenter.rest.controller;

import infrastructure.memory.MemoryCurrencyStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import presenter.rest.http.Request;
import presenter.rest.http.Response;

public class RouteNotFoundActionTest
{
    @Test
    public void testItHandles()
    {
        Action action = new RouteNotFoundAction();
        Assertions.assertEquals(new Response(200, "Not Found"), action.handle(new Request()));
    }
}
