/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
package typevalues;

import typeexpressions.Expression;

import java.util.HashSet;
import java.util.Set;

public abstract class MaybeValue<E> implements Expression {

    public abstract boolean isValue();
    public abstract E getValue();

    public MaybeValue evaluate(Set<Cell> visited) {

        if(!this.hasValue()){
            return NoValue.getNoValue();
        }
        return this;
    }

    public Set<Cell> references(Set<Cell> visited){

        Set<Cell> setCell = new HashSet<>();
        return  setCell;
    }

    public boolean hasValue() {
        return isValue();
    }

}
