package presenter.rest.http;

import presenter.rest.controller.Action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Routing
{
    private final List<HashMap<String, Object>> routes;

    public Routing()
    {
        this.routes = new ArrayList<>();
    }

    public void addRouting(String route, String method, Action handler)
    {
        HashMap<String, Object> routing = new HashMap<>();

        routing.put("route", route);
        routing.put("method", method);
        routing.put("action", handler);

        this.routes.add(routing);
    }

    public Action findAction(String path, String method) throws Exception
    {
        for (HashMap<String, Object> route : this.routes) {
            if (route.get("route").equals(path) && route.get("method").equals(method)) {
                return (Action) route.get("action");
            }
        }

        throw new Exception("There is no routes");
    }
}
