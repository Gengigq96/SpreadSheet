package typevalues;

import typeexpressions.Expression;

public class Cell {

    private Expression exp;

    public Cell (){

    }

    public MaybeValue evaluate(){
        return exp.evaluate();
    }

    public void set(Expression _exp){
        this.exp = _exp;
        //TODO: implements this
        throw new UnsupportedOperationException();
    }



}
