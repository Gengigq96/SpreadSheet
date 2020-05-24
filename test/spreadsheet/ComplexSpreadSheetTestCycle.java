package spreadsheet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import typevalues.NoValue;
import typevalues.SomeValue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static spreadsheet.SpreadSheet.*;

public class ComplexSpreadSheetTestCycle {

    @BeforeEach
    public void setUpSheet(){
        put("a1", "b1");
        put("b1", "c1");
        put("c1", "a1");

    }
    @Test
    public void dependency_cycle(){
        assertEquals(NoValue.getNoValue(), get("c1"));
    }

    @AfterEach
    public void tearDown(){
        clear();
    }
}