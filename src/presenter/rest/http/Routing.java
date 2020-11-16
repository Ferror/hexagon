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
        HashMap<String, Object> routing = new HashMap<>();

        routing.put("route", "/test");
        routing.put("method", "GET");
        routing.put("action", new ExampleAction());

        this.routes.add(routing);

//        routing.put("route", "/");
//        routing.put("method", "GET");
//        routing.put("action", new ExampleHandler());
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
