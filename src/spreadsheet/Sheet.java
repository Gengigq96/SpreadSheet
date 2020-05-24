/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
package spreadsheet;

import typevalues.Cell;
import typevalues.NoValue;

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
        if (celdas.containsKey(name))
        return celdas.get(name);
        throw new IndexOutOfBoundsException("cell "+name+" cannot be found inside the sheet");
    }
}
