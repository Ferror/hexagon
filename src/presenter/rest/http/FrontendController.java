package presenter.rest.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import domain.currency.CurrencyStorage;
import framework.Container;
import presenter.rest.controller.Action;
import presenter.rest.controller.CurrencyAction;
import presenter.rest.controller.ExampleAction;
import presenter.rest.controller.RouteNotFoundAction;

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
        Request request = new Request();
        String method = "GET";
        Action action;

        try {
            action = this.routing.findAction(path, method);
        } catch (Exception exception) {
            action = new RouteNotFoundAction();
        }

        Response response = action.handle(request);

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
