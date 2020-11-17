package domain;

public interface EventStore
{
    void store(Event event);
}
