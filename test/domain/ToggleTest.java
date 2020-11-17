package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToggleTest
{
    @Test
    public void testItEquals()
    {
        Toggle toggle = new Toggle("feature");
        Assertions.assertTrue(toggle.equals(new Toggle("feature")));
        Assertions.assertTrue(toggle.equals(toggle));
        Assertions.assertFalse(toggle.equals(null));
        Assertions.assertFalse(toggle.equals(new Object()));
        Assertions.assertFalse(toggle.equals(new Toggle("not-a-feature")));
    }

    @Test
    public void testItGetsHashCode()
    {
        Toggle toggle = new Toggle("feature");
        Assertions.assertEquals(-979207403, toggle.hashCode());
    }
}
