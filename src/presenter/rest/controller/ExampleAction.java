package presenter.rest.controller;

import presenter.rest.http.Request;
import presenter.rest.http.Response;

public class ExampleAction implements Action
{
    @Override
    public Response handle(Request request)
    {
        return new Response();
    }
}
