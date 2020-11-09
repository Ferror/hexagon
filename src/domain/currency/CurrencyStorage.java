package domain.currency;

import domain.Currency;
import java.util.List;

public interface CurrencyStorage
{
    List<Currency> getAll();
}
