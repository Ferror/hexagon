package presenter.rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class FrontendController implements HttpHandler
{
    @Override
    public void handle(HttpExchange exchange) throws IOException
    {
        String path = exchange.getRequestURI().getPath();
        Routing routing = new Routing();
        Request request = new Request();
        String method = "GET";

        Response response = routing.findAction(path, method).handle(request);

        exchange.getResponseHeaders().add("Content-Type", "text/json");
        exchange.sendResponseHeaders(200, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.getResponseBody().close();
    }
}
