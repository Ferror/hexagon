package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTest
{
    @Test
    public void testItAdds()
    {
        Number number = new Number(2);
        Assertions.assertEquals(2, number.toInteger());
    }

    @Test
    public void testItFails()
    {
        Number number = new Number(2);
        Assertions.assertEquals(1, number.toInteger());
    }
}
