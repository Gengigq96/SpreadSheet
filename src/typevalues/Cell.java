package typevalues;

import typeexpressions.Expression;

public class Cell {

    private Expression exp;
    private MaybeValue val;

    public Cell (Expression nv){
        this.exp = nv;
        evaluate();
    }
    public Cell (){
    }
    public MaybeValue evaluate(){
        val = exp.evaluate();
        return val;
    }

    public void set(Expression _exp){
        this.exp = _exp;
    }

    public MaybeValue get(){
        return  val;
    }



}
