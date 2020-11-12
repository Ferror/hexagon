package presenter.console;

import domain.Currency;
import domain.currency.CurrencyStorage;
import framework.Container;
import framework.Environment;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class ConsoleApp
{
    public static void main(String[] args)
    {
        Container container = new Container(new Environment());
        CurrencyStorage storage = (CurrencyStorage) container.get("domain.currency.CurrencyStorage");

        //generate table
        List<String> headers = new ArrayList<>();
        headers.add("Name");
        headers.add("Symbol");
        Table table = new Table(headers, storage.getAll());
        //render headers
        System.out.print(table.render());
        //render body
        //style table
        String input;

        do {
            System.out.print("command: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        } while (!input.equals("!q"));

        System.out.println("Exited.");
    }
}
