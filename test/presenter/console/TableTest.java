package presenter.console;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TableTest
{
    @Test
    public void testItBuildsTable()
    {
        Assertions.assertEquals(
            "Header LongHeader\n" +
            "Row    RowRow    \n" +
            "R      R         \n",
            ""
        );
        Assertions.assertEquals(
            "H   LongHeader\n" +
            "Row RowRow    \n" +
            "R   R         \n",
            ""
        );
    }
}
