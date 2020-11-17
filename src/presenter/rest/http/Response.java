package presenter.rest.http;

import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Response response = (Response) o;

        return statusCode.equals(response.statusCode) && data.equals(response.data);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(statusCode, data);
    }
}
