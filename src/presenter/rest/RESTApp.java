package presenter.rest;

import com.sun.net.httpserver.HttpServer;
import framework.Container;
import framework.Environment;
import presenter.rest.http.FrontendController;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class RESTApp
{
    public static void main(String[] args) throws IOException
    {
        Container container = new Container(new Environment());
        InetAddress localHost = InetAddress.getLoopbackAddress();
        HttpServer server = HttpServer.create(new InetSocketAddress(localHost, 8182), 0);
        server.createContext("/", new FrontendController(container));
        server.setExecutor(null);
        server.start();
    }
}
