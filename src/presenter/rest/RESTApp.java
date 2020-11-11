package presenter.rest;

import com.sun.net.httpserver.HttpServer;
import domain.currency.CurrencyStorage;
import framework.Container;
import framework.Environment;
import presenter.rest.handler.HomeHandler;
import java.io.IOException;
import java.net.InetSocketAddress;

public class RESTApp
{
    public static void main(String[] args) throws IOException
    {
        Container container = new Container(new Environment());
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8765), 0);
        server.createContext("/", new HomeHandler(
            (CurrencyStorage) container.get("domain.currency.CurrencyStorage"))
        );
        server.setExecutor(null);
        server.start();
    }
}
