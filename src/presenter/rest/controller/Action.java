package presenter.rest.controller;

import presenter.rest.http.Request;
import presenter.rest.http.Response;

public interface Action
{
    Response handle(Request request);
}
