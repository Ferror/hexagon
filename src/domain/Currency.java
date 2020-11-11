package domain;

import java.util.HashMap;

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
}
