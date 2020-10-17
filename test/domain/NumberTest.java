package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberTest
{
    @Test
    public void testItAdds()
    {
        Number number = new Number(2);
        assertEquals(2, number.toInteger());
    }

    @Test
    public void testItFails()
    {
        Number number = new Number(2);
        assertEquals(1, number.toInteger());
    }
}
