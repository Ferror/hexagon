package presenter.console;

import domain.Currency;
import domain.currency.CurrencyStorage;
import framework.Container;
import framework.Environment;
import infrastructure.memory.MemoryCurrencyStorage;

import java.util.HashMap;
import java.util.Scanner;

public class ConsoleApp
{
    public static void main(String[] args)
    {
        Container container = new Container(new Environment());
        CurrencyStorage storage = new MemoryCurrencyStorage();
        String input;

        do {
            System.out.print("command: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (input.equals("--help")) {
                System.out.println("HELP");
                System.out.println("commands:");
                System.out.println("1. currency:list");
            }

            if (input.equals("currency:list")) {
                for (Currency currency : storage.getAll()) {
                    HashMap<String, String> map = currency.serialize();
                    System.out.println(map.entrySet());
                }
            }

            if (input.equals("currency:create")) {
                storage.getAll().add(new Currency("New", "ABC"));
            }
        } while (!input.equals("!q"));

        System.out.println("Exited.");
    }
}
