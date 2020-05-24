package spreadsheet;
import static spreadsheet.SpreadSheet.*;
import org.junit.Test;
import typevalues.SomeValue;

import static org.junit.Assert.assertEquals;

public class SpreadSheetTest {

    @Test
    public void setUp(){
        put("a1", 12);
        put("b1", plus("a1","a2"));
        put("a2", 1);
        assertEquals(new SomeValue(13),get("b1"));
    }


}