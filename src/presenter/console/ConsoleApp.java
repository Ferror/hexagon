package presenter.console;

import framework.Container;
import framework.Environment;
import java.util.Scanner;

public class ConsoleApp
{
    public static void main(String[] args)
    {
        Container container = new Container(new Environment());
        String input;

        do {
            System.out.print("command: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        } while (!input.equals("!q"));

        System.out.println("Exited.");
    }
}
