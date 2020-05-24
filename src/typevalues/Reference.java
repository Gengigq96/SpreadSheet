package typevalues;

import typeexpressions.Expression;

import java.util.Set;

public class Reference implements Expression {

    private Cell ref;

    public Reference(Cell ref){
        this.ref = ref;
    }

    @Override
    public MaybeValue evaluate(Set<Cell> visited) {
        return ref.evaluate(visited);
    }

    @Override
    public Set<Cell> references(Set<Cell> visited) {
        return ref.references(false,visited);
    }
}
