package presenter.rest.http;

import domain.Toggle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseTest
{
    @Test
    public void testItEquals()
    {
        Response response = new Response();
        Assertions.assertTrue(response.equals(new Response()));
        Assertions.assertTrue(response.equals(response));
        Assertions.assertFalse(response.equals(null));
        Assertions.assertFalse(response.equals(new Object()));
        Assertions.assertFalse(response.equals(new Response(200, "not-a-response")));
    }

    @Test
    public void testItGetsHashCode()
    {
        Response response = new Response();
        Assertions.assertEquals(7285, response.hashCode());
    }
}
