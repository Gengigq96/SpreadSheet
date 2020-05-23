package spreadsheet;

import typevalues.Cell;
import typevalues.NoValue;

import java.util.HashMap;

public class Sheet {

    private HashMap<String, Cell> celdas = new  HashMap<String, Cell>();
    private int indexChar = 97;
    private NoValue novalue = new NoValue();

    public Sheet(int x){
        for(int i = 0 ; i < x ; i++){
            for(int j = 1 ; j <= x ; j++){
                celdas.put(String.valueOf(((char)indexChar+i)+j),new Cell(novalue.getNoValue()));
            }
        }



    }


}
