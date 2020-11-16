package presenter.rest.handler;

public class ExampleHandler implements Action
{
    @Override
    public Response handle(Request request)
    {
        String response = "OK";
        exchange.getResponseHeaders().add("Content-Type", "text/json");
        exchange.sendResponseHeaders(200, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.getResponseBody().close();
    }
}
