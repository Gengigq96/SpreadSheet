package typevalues;

public class NoValue extends MaybeValue {

    private static NoValue noVal;

    public static NoValue getNoValue(){

        if(noVal == null){
            noVal = new NoValue(); //constructor buit
        }
        return noVal;
    }
    public Integer getValue() {
        return null;
    }
    @Override
    public boolean isValue() {
        return false;
    }
}
