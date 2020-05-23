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
    private NoValue novalue = new NoValue();

    public Sheet(int x){
        for(int i = 0 ; i < x ; i++){
            for(int j = 1 ; j <= x ; j++){
                String text = Character.toString((char)indexChar+i);
                text += j;
                celdas.put(text,new Cell(novalue.getNoValue()));
            }
        }
    }
    public void set(String name, Expression exp){
        if(celdas.containsKey(name)){
            celdas.replace(name,new Cell(exp));
        }
    }
    public MaybeValue get(String name){
        if(celdas.containsKey(name)){
            MaybeValue value = celdas.get(name).get();
            if(value.hasValue()){
                SomeValue sv = (SomeValue) value;
                return sv;
            }else {
                throw new UnsupportedOperationException();
            }
        }
        throw new UnsupportedOperationException();
    }
    public Cell getCell(String name){
        return celdas.get(name);
    }
}
