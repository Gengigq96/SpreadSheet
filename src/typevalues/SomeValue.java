/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
package typevalues;


import java.util.Objects;

public class SomeValue extends MaybeValue {

    private Integer val;

    public SomeValue(int i){
        this.val = i;
    }

    public Integer getValue() {
        return val;
    }

    public boolean isValue(){
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeValue someValue = (SomeValue) o;
        return Objects.equals(val, someValue.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
