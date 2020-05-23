package typeexpressions;

import typevalues.MaybeValue;
import typevalues.SomeValue;

public abstract class Operation implements Expression {

    private Expression e1;
    private Expression e2;

    public Operation(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public abstract int operate(int i1, int i2);

    public MaybeValue evaluate() {
        MaybeValue mv1 = e1.evaluate();
        MaybeValue mv2 = e2.evaluate();
        if (mv1.hasValue() && mv2.hasValue()) {
            SomeValue sv1 = (SomeValue) mv1.evaluate();
            SomeValue sv2 = (SomeValue) mv2.evaluate();
            return new SomeValue(operate(sv1.getValue(), sv2.getValue()));
        }else if(mv1.hasValue())return mv1;
        else return mv2;
    }

}
