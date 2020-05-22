package typevalues;

public class NoValue extends MaybeValue {

    private static NoValue noVal;

    private NoValue(){

    }

    public static NoValue getNoValue(){

        if(noVal == null){
            noVal = new NoValue();
        }
        return noVal;
    }


    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public MaybeValue evaluate() {
        return null;
    }
}
