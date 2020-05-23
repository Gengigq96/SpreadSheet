package typevalues;

import typeexpressions.Expression;

public class Cell {

    private Expression exp;
    private MaybeValue val;

    public Cell (NoValue nv){
        this.exp = nv;
    }

    public MaybeValue evaluate(){
        return exp.evaluate();
    }

    public void set(Expression _exp){
        this.exp = _exp;
    }



}
