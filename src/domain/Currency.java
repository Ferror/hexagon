package domain;

import java.util.HashMap;
import java.util.Objects;

public class Currency
{
    private final String name;
    private final String iso;

    public Currency(String name, String iso)
    {
        this.name = name;
        this.iso = iso;
    }

    public String getName()
    {
        return name;
    }

    public String getIso()
    {
        return iso;
    }

    public HashMap<String, String> serialize()
    {
        HashMap<String, String> items = new HashMap<>();

        items.put("name", this.name);
        items.put("iso", this.iso);

        return items;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Currency currency = (Currency) o;
        return name.equals(currency.name) && iso.equals(currency.iso);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, iso);
    }
}
