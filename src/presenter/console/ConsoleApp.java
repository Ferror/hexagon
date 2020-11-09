package presenter.console;

import framework.Container;
import framework.Environment;

public class ConsoleApp
{
    public static void main(String[] args)
    {
        Container container = new Container(new Environment());

        System.out.println("Console");
    }
}
