package infrastructure.memory;

import domain.Currency;
import domain.currency.CurrencyStorage;

import java.util.ArrayList;
import java.util.List;

public class MemoryCurrencyStorage implements CurrencyStorage
{
    @Override
    public List<Currency> getAll()
    {
        List<Currency> memoryList = new ArrayList<>();

        memoryList.add(new Currency("Dollar", "USD"));

        return memoryList;
    }
}
