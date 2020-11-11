package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class CurrencyTest
{
    @Test
    public void testItGetsName()
    {
        Currency currency = new Currency("Dollar", "USD");
        Assertions.assertEquals("Dollar", currency.getName());
    }

    @Test
    public void testItGetsIsoCode()
    {
        Currency currency = new Currency("Dollar", "USD");
        Assertions.assertEquals("USD", currency.getIso());
    }

    @Test
    public void testItSerializes()
    {
        Currency currency = new Currency("Dollar", "USD");
        HashMap<String, String> items = new HashMap<>();
        items.put("name", "Dollar");
        items.put("iso", "USD");
        Assertions.assertEquals(items, currency.serialize());
    }
}
