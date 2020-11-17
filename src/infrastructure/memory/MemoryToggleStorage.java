package infrastructure.memory;

import domain.Toggle;
import domain.toggle.ToggleStorage;

import java.util.ArrayList;
import java.util.List;

public class MemoryToggleStorage implements ToggleStorage
{
    private final ArrayList<Toggle> toggles;

    public MemoryToggleStorage()
    {
        this.toggles = new ArrayList<>();
    }

    @Override
    public List<Toggle> getAvailable()
    {
        return this.toggles;
    }
}
