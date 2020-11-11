package infrastructure.memory;

import domain.Currency;
import domain.currency.CurrencyStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class MemoryCurrencyStorageTest
{
    @Test
    public void testItGetsAllCurrencies()
    {
        CurrencyStorage storage = new MemoryCurrencyStorage();
        List<Currency> list = new ArrayList<>();
        list.add(new Currency("Dollar", "USD"));
        list.add(new Currency("Euro", "EUR"));
        list.add(new Currency("Pound", "GBP"));

        Assertions.assertIterableEquals(list, storage.getAll());
    }
}
