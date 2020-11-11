package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTest
{
    @Test
    public void testItTranslatesToInteger()
    {
        Number number = new Number(2);
        Assertions.assertEquals(2, number.toInteger());
    }

    @Test
    public void testItAdds()
    {
        Number number = new Number(2);
        Assertions.assertEquals(6, number.add(new Number(4)).toInteger());
    }
}
