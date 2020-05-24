/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
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
    @Test
    public void dependency_cycle_recalculate(){
        put("c1", 1);
        assertEquals(new SomeValue(1), get("c1"));
    }

    @AfterEach
    public void tearDown(){
        clear();
    }
}