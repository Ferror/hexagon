package presenter.rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;

public class HomeHandler implements HttpHandler
{
    @Override
    public void handle(HttpExchange exchange) throws IOException
    {
        String path = exchange.getRequestURI().getPath();
        int code = 404;

        if (path.equals("/currency")) {
            code = 204;
        }

        String response = "{\"code\": " + code + ", \"route\": " + path + "}";
        exchange.getResponseHeaders().add("Content-Type", "text/json");
        exchange.sendResponseHeaders(200, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.getResponseBody().close();
    }
}
