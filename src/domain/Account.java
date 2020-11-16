package domain;

import domain.account.Identifier;

import java.util.HashMap;
import java.util.List;

public class Account
{
    private final Identifier identifier;
    private final List<Toggle> listOfToggles;

    public Account(Identifier identifier, List<Toggle> listOfToggles)
    {
        this.identifier = identifier;
        this.listOfToggles = listOfToggles;
    }

    public Boolean isGranted(String toggle)
    {
        return this.listOfToggles.contains(new Toggle(toggle));
    }

    public Boolean hasAccess(String resource)
    {
        return true;
    }

    public HashMap<String, String> serialize()
    {
        HashMap<String, String> map = new HashMap<>();

        map.put("id", this.identifier.toString());

        return map;
    }
}
