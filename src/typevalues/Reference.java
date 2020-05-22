package typevalues;

import typeexpressions.Expression;

public class Reference implements Expression {

    private Cell ref;

    public Reference(Cell ref){
        this.ref = ref;
    }




    @Override
    public MaybeValue evaluate() {
        //TODO: implements this
        throw new UnsupportedOperationException();
    }
}
