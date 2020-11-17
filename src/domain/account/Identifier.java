package domain.account;

import java.util.UUID;

public class Identifier
{
    private final UUID identifier;

    public Identifier(UUID identifier)
    {
        this.identifier = identifier;
    }

    @Override
    public String toString()
    {
        return this.identifier.toString();
    }
}
