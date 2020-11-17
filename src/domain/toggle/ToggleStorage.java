package domain.toggle;

import domain.Toggle;

import java.util.List;

public interface ToggleStorage
{
    List<Toggle> getAvailable();
}
