package domain.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.UUID;

public class IdentifierTest
{
    @Test
    public void testToString()
    {
        Identifier id = new Identifier(UUID.fromString("37ab44a3-5228-437d-a863-b91016da2d08"));
        Assertions.assertEquals("37ab44a3-5228-437d-a863-b91016da2d08", id.toString());
    }
}
