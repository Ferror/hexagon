package domain;

import java.util.HashMap;

public class Event
{
    private final String name;

    public Event(String name)
    {
        this.name = name;
    }

    public HashMap<String, String> serialize()
    {
        return new HashMap<>();
    }
}
