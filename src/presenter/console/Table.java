package presenter.console;

import domain.Currency;
import java.util.List;

public class Table
{
    private final List<String> headers;
    private final List<Currency> items;

    public Table(List<String> headers, List<Currency> items)
    {
        this.headers = headers;
        this.items = items;
    }

    public String render()
    {
        StringBuilder mainBuilder = new StringBuilder();
        StringBuilder headerBuilder = new StringBuilder();

        for (String header : this.headers) {
            headerBuilder.append(header);
        }

        headerBuilder.append("\n");
        headerBuilder.append("\n");
        StringBuilder itemsBuilder = new StringBuilder();

        for (Currency currency : this.items) {
            itemsBuilder.append(currency.getIso());
            itemsBuilder.append(currency.getName());
        }

        mainBuilder.append(headerBuilder.toString());
        mainBuilder.append(itemsBuilder.toString());

        return mainBuilder.toString();
    }
}
