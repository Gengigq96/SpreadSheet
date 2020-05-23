package typevalues;

public class NoValue extends MaybeValue {

    private static NoValue noVal;

    public static NoValue getNoValue(){

        if(noVal == null){
            noVal = new NoValue(); //constructor buit
        }
        return noVal;
    }

    @Override
    public boolean isValue() {
        return false;
    }
}
