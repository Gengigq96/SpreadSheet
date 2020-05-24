package typevalues;

import typeexpressions.Expression;

import java.util.HashSet;
import java.util.Set;

public abstract class MaybeValue<E> implements Expression {


    public abstract boolean isValue();

    public MaybeValue evaluate(Set<Cell> visited) {

        if(!this.hasValue()){
            return NoValue.getNoValue();
        }
        return this;
    }
    public abstract E getValue();
    public Set<Cell> references(Set<Cell> visited){

        Set<Cell> setCell = new HashSet<>();
        return  setCell;
    }
    public boolean hasValue() {
        return isValue();
    }

}
