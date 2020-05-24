package typeexpressions;

import typevalues.Cell;
import typevalues.MaybeValue;
import typevalues.SomeValue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Operation implements Expression {

    private Expression e1;
    private Expression e2;

    public Operation(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public abstract int operate(int i1, int i2);

    public MaybeValue evaluate(Set<Cell> visited) {
        MaybeValue mv1 = e1.evaluate(visited);
        MaybeValue mv2 = e2.evaluate(visited);
        if (mv1.hasValue() && mv2.hasValue()) {
            return new SomeValue(operate((int)mv1.getValue(),(int) mv2.getValue()));
        }else if(!mv1.hasValue())return mv1;
        return mv2;
    }
    public Set<Cell> references(Set<Cell> visited) {
        Set<Cell> setCell = new HashSet<>();
        Iterator<Cell> it = e1.references(visited).iterator();
        while(it.hasNext()){
            setCell.add(it.next());
        }
        Iterator<Cell> it2 = e2.references(visited).iterator();
        while(it2.hasNext()){
            setCell.add(it2.next());
        }
        return setCell;
    }
}
