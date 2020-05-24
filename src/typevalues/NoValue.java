/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
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
