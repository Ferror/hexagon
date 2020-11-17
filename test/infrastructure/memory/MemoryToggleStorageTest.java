package infrastructure.memory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryToggleStorageTest
{
    @Test
    public void testItGetsAvailable()
    {
        MemoryToggleStorage storage = new MemoryToggleStorage();

        Assertions.assertTrue(storage.getAvailable().isEmpty());
    }
}
