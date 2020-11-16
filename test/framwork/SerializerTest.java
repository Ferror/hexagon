package framwork;

import domain.Currency;
import framework.Serializer;
import org.junit.jupiter.api.Assertions;

public class SerializerTest
{
    public void testItSerializes()
    {
        Serializer serializer = new Serializer();

        Assertions.assertEquals(
            "{\"iso\":\"USD\",\"name\":\"Dollar\"}",
            serializer.serialize(new Currency("Dollar", "USD"))
        );
    }
}
