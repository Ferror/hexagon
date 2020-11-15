package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class EventTest
{
    @Test
    public void testItSerializes()
    {
        Event event = new Event("event_name");
        HashMap<String, String> items = new HashMap<>();
        items.put("name", "event_name");

        Assertions.assertEquals(items, event.serialize());
    }
}
