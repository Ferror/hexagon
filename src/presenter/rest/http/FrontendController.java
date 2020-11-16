package presenter.rest.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import domain.currency.CurrencyStorage;
import framework.Container;
import presenter.rest.controller.CurrencyAction;
import presenter.rest.controller.ExampleAction;

import java.io.IOException;

public class FrontendController implements HttpHandler
{
    private final Container container;
    private final Routing routing;

    public FrontendController(Container container)
    {
        this.container = container;
        this.routing = new Routing();
        this.registerActions();
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

    private void registerActions()
    {
        this.routing.addRouting("/", "GET", new ExampleAction());
        this.routing.addRouting("/test", "GET", new ExampleAction());
        this.routing.addRouting("/test", "POST", new ExampleAction());
        this.routing.addRouting("/currency", "GET", new CurrencyAction((CurrencyStorage) this.container.get("domain.currency.CurrencyStorage")));
    }
}
