package spreadsheet;
import static org.junit.jupiter.api.Assertions.*;
import static spreadsheet.SpreadSheet.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import typevalues.NoValue;
import typevalues.SomeValue;

public class SpreadSheetTest {

    @BeforeEach
    public void setUpSheet(){
        put("a3", mult("a1","a2"));
    }
    @Test
    public void cell_has_novalue_if_depends_on_empty_cells(){
        assertFalse(get("a3").hasValue());
    }
    @Test
    public void recalculation_works(){
        put("a1", 42);
        put("a2", 20);
        assertEquals(new SomeValue(840), get("a3"));
    }
    @Test
    public void cellOutofRange(){
        assertThrows(IndexOutOfBoundsException.class, () -> {get("a7");});
    }
    @Test
    public void noValueExpression(){
        put("a1", 42);
        clear();
        assertEquals(NoValue.getNoValue(), get("a3"));
    }
    @Test
    public void sameExpression(){
        put("a1", 42);
        put("a2", 20);
        put("c4","a3");
        assertEquals(get("a3"), get("c4"));
    }
    @Test
    public void clearTest(){
        put("a1", 42);
        clear();
        assertEquals(NoValue.getNoValue(), get("a1"));
    }
    @AfterEach
    public void clearSheet(){
        clear();
    }
}