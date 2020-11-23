package presenter.rest.controller;

import domain.currency.CurrencyStorage;
import presenter.rest.http.Request;
import presenter.rest.http.Response;

public class CurrencyAction implements Action
{
    private final CurrencyStorage storage;

    public CurrencyAction(CurrencyStorage storage)
    {
        this.storage = storage;
    }

    @Override
    public Response handle(Request request)
    {
        return new Response(200, "currency");
    }
}
