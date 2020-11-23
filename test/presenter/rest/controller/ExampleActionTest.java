package presenter.rest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import presenter.rest.http.Request;
import presenter.rest.http.Response;

public class ExampleActionTest
{
    @Test
    public void testItHandles()
    {
        Action action = new ExampleAction();
        Assertions.assertEquals(new Response(), action.handle(new Request()));
    }
}
