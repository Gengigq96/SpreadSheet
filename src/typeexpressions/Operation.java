package typeexpressions;

import typevalues.MaybeValue;

public abstract class Operation implements Expression {

    private Expression e1;
    private Expression e2;

    public Operation(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public abstract int operate(int i1, int i2);

    public abstract MaybeValue evaluate();


}
