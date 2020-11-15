package infrastructure.memory;

import domain.Currency;
import domain.currency.CurrencyStorage;

import java.util.ArrayList;
import java.util.List;

public class MemoryCurrencyStorage implements CurrencyStorage
{
    private final List<Currency> currencies;

    public MemoryCurrencyStorage()
    {
        List<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency("Dollar", "USD"));
        currencies.add(new Currency("Euro", "EUR"));
        currencies.add(new Currency("Pound", "GBP"));

        this.currencies = new ArrayList<>();
    }

    @Override
    public List<Currency> getAll()
    {
        return this.currencies;
    }
}
