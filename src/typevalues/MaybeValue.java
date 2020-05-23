package typevalues;

import typeexpressions.Expression;

public abstract class MaybeValue implements Expression {


    public abstract boolean isValue();

    public MaybeValue evaluate() {

        if(!this.hasValue()){
            return NoValue.getNoValue();
        }

        return this;
    }

    public boolean hasValue() {
        return isValue();
    }

}
