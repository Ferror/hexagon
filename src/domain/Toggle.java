package domain;

import java.util.Objects;

public class Toggle
{
    private final String name;

    public Toggle(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Toggle toggle = (Toggle) o;

        return name.equals(toggle.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
