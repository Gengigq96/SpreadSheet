package typeexpressions;

import typevalues.MaybeValue;

public class Mult extends Operation {

    public Mult(Expression e1, Expression e2) {
        super(e1, e2);
    }


    @Override
    public int operate(int i1, int i2) {
        return i1*i2;
    }

    @Override
    public MaybeValue evaluate() {
        //TODO: implements this
        throw new UnsupportedOperationException();
    }
}
