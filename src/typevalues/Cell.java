package typevalues;

import typeexpressions.Expression;

public class Cell {

    private Expression exp;
    private MaybeValue val;

    public Cell (){

    }

    public MaybeValue evaluate(){
        return val.evaluate();
    }

    public void set(Expression exp){
        //TODO: implements this
        throw new UnsupportedOperationException();
    }



}
