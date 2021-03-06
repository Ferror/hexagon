package infrastructure.memory;

import domain.Event;
import domain.EventStore;

import java.util.ArrayList;
import java.util.List;

public class MemoryEventStore implements EventStore
{
    private final List<Event> events;

    public MemoryEventStore()
    {
        this.events = new ArrayList<>();
    }

    @Override
    public void store(Event event)
    {
        this.events.add(event);
    }

    public List<Event> getAll()
    {
        return this.events;
    }
}
