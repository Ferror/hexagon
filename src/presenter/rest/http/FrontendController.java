package presenter.rest.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import framework.Container;

import java.io.IOException;

public class FrontendController implements HttpHandler
{
    private final Container container;

    public FrontendController(Container container)
    {
        this.container = container;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException
    {
        String path = exchange.getRequestURI().getPath();
        Routing routing = new Routing();
        Request request = new Request();
        String method = "GET";

        Response response = routing.findAction(path, method).handle(request);

        exchange = response.addResponseHeaders(exchange);
        exchange.getResponseHeaders().add("Content-Type", "text/json");
        exchange.getResponseBody().close();
    }
}
