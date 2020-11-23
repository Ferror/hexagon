package framwork;

import domain.currency.CurrencyStorage;
import framework.Container;
import framework.Environment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerTest
{
    @Test
    public void testItGets()
    {
        Container container = new Container(new Environment());
        Assertions.assertTrue(container.get("domain.currency.CurrencyStorage") instanceof CurrencyStorage);
    }
}
