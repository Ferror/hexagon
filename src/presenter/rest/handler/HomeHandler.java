package presenter.rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;

public class HomeHandler implements HttpHandler
{
    @Override
    public void handle(HttpExchange exchange) throws IOException
    {
        String response;

        if (exchange.getRequestURI().getPath().endsWith("1")) {
            response = "{\"code\": 204}";
        } else {
            response = "{\"code\": 200}";
        }

        exchange.getResponseHeaders().add("Content-Type", "text/json");
        exchange.sendResponseHeaders(200, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.getResponseBody().close();
    }
}
