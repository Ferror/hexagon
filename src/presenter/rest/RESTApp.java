package presenter.rest;

import com.sun.net.httpserver.HttpServer;
import presenter.rest.handler.HomeHandler;
import java.io.IOException;
import java.net.InetSocketAddress;

public class RESTApp
{
    public static void main(String[] args) throws IOException
    {
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8765), 0);
        server.createContext("/", new HomeHandler());
        server.setExecutor(null);
        server.start();
    }
}
