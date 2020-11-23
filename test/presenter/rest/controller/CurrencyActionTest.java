package presenter.rest.controller;

import infrastructure.memory.MemoryCurrencyStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import presenter.rest.http.Request;
import presenter.rest.http.Response;

public class CurrencyActionTest
{
    @Test
    public void testItHandles()
    {
        Action action = new CurrencyAction(new MemoryCurrencyStorage());
        Assertions.assertEquals(new Response(200, "currency"), action.handle(new Request()));
    }
}
