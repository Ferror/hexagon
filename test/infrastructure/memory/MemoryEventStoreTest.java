package infrastructure.memory;

import domain.Event;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryEventStoreTest
{
    @Test
    public void testItGetsAllEvents()
    {
        MemoryEventStore store = new MemoryEventStore();
        Assertions.assertTrue(store.getAll().isEmpty());

        store.store(new Event("event_1"));
        store.store(new Event("event_2"));
        store.store(new Event("event_3"));
        store.store(new Event("event_4"));
        Assertions.assertFalse(store.getAll().isEmpty());
        Assertions.assertEquals(4, store.getAll().size());

    }
}
