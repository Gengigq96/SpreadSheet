/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
package typeexpressions;

public class Mult extends Operation {

    public Mult(Expression e1, Expression e2) {
        super(e1, e2);
    }


    @Override
    public int operate(int i1, int i2) {
        return i1*i2;
    }

}
