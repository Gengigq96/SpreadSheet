package typevalues;

import typeexpressions.Expression;

public class SomeValue extends MaybeValue {

    private Integer val;

    public SomeValue(int i){
        this.val = i;
    }

    protected Integer getValue() {
        return val;
    }

    public boolean isValue(){
        return true;
    }


}
