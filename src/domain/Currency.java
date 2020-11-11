package domain;

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
}
