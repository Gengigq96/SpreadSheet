package typevalues;

import typeexpressions.Expression;

import java.util.Set;

public class Reference implements Expression {

    private Cell ref;

    public Reference(Cell ref){
        this.ref = ref;
    }

    @Override
    public MaybeValue evaluate() {
        return ref.evaluate();
    }

    @Override
    public Set<Cell> references() {
        return ref.references(false);
    }
}
