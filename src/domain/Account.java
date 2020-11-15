package domain;

import java.util.List;

public class Account
{
    private final List<Toggle> listOfToggles;

    public Account(List<Toggle> listOfToggles)
    {
        this.listOfToggles = listOfToggles;
    }

    public Boolean isGranted(String toggle)
    {
        return true;
    }

    public Boolean hasAccess(String resource)
    {
        return true;
    }
}
