package domain;

import domain.account.Identifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class AccountTest
{
    @Test
    public void testItIsGranted()
    {
        List<Toggle> toggles = new ArrayList<>();
        toggles.add(new Toggle("feature1"));
        toggles.add(new Toggle("feature2"));
        Account account = new Account(new Identifier(UUID.randomUUID()), toggles);

        Assertions.assertTrue(account.isGranted("feature1"));
        Assertions.assertFalse(account.isGranted("not-existing-feature"));
    }

    @Test
    public void testItHasAccess()
    {
        Account account = new Account(new Identifier(UUID.randomUUID()), new ArrayList<>());

        Assertions.assertTrue(account.hasAccess("resource"));
    }

    @Test
    public void testItSerializes()
    {
        Account account = new Account(new Identifier(UUID.randomUUID()), new ArrayList<>());
        HashMap<String, String> items = new HashMap<>();
        items.put("id", "37ab44a3-5228-437d-a863-b91016da2d08");
        Assertions.assertEquals(items, account.serialize());
    }
}
