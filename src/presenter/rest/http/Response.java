package presenter.rest.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpsExchange;

import java.io.IOException;

public class Response
{
    private final Integer statusCode;
    private final String data;

    public Response()
    {
        this.statusCode = 204;
        this.data = "";
    }

    public Response(Integer statusCode, String data)
    {
        this.statusCode = statusCode;
        this.data = data;
    }

    public HttpExchange addResponseHeaders(HttpExchange exchange) throws IOException
    {
        exchange.sendResponseHeaders(this.statusCode, this.data.length());
        exchange.getResponseBody().write(this.data.getBytes());

        return exchange;
    }
}
