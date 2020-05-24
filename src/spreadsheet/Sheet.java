package spreadsheet;

import typeexpressions.Expression;
import typevalues.Cell;
import typevalues.MaybeValue;
import typevalues.NoValue;
import typevalues.SomeValue;

import java.util.HashMap;

public class Sheet {

    private HashMap<String, Cell> celdas = new  HashMap<String, Cell>();
    private int indexChar = 97;

    public Sheet(int x){
        for(int i = 0 ; i < x ; i++){
            for(int j = 1 ; j <= x ; j++){
                String text = Character.toString((char)indexChar+i);
                text += j;
                Cell init = new Cell();
                init.set(NoValue.getNoValue());
                celdas.put(text,init);
            }
        }
    }

    public Cell getCell(String name){
        return celdas.get(name);
    }
}
