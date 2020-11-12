package presenter.rest.handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import domain.Currency;
import domain.currency.CurrencyStorage;

import java.io.IOException;

public class HomeHandler implements HttpHandler
{
    private final CurrencyStorage storage;

    public HomeHandler(CurrencyStorage storage)
    {
        this.storage = storage;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException
    {
        String path = exchange.getRequestURI().getPath();
        StringBuilder content = new StringBuilder();
        int code = 404;
        content.append("[");

        if (path.equals("/currency")) {
            for (Currency currency : this.storage.getAll()) {
                content
                    .append("{\"name\": ")
                    .append("\"")
                    .append(currency.getName())
                    .append("\"")
                    .append(",\"iso\": ")
                    .append("\"")
                    .append(currency.getIso())
                    .append("\"}");
            }
            code = 204;
        }
        content.append("]");

        String response = "{\"code\": " + code + ", \"route\": \"" + path + "\", \"content\": " + content + "}";
        exchange.getResponseHeaders().add("Content-Type", "text/json");
        exchange.sendResponseHeaders(200, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.getResponseBody().close();
    }
}
