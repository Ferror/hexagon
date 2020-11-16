package presenter.rest.http;

import presenter.rest.controller.Action;
import presenter.rest.controller.ExampleAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Routing
{
    List<HashMap<String, Object>> routes;

    public Routing()
    {
        this.routes = new ArrayList<>();
        this.register();
    }

    private void register()
    {
        this.addRouting("/", "GET", new ExampleAction());
        this.addRouting("/test", "GET", new ExampleAction());
        this.addRouting("/test", "POST", new ExampleAction());
    }

    private void addRouting(String route, String method, Action handler)
    {
        HashMap<String, Object> routing = new HashMap<>();

        routing.put("route", route);
        routing.put("method", method);
        routing.put("action", handler);

        this.routes.add(routing);
    }

    public Action findAction(String path, String method)
    {
        return (Action) this.routes
            .stream()
            .filter(map -> map.get("route").equals(path))
            .findFirst()
            .get()
            .get("action");
    }
}
