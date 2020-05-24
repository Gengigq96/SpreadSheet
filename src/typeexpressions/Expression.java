/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
package typeexpressions;

import typevalues.Cell;
import typevalues.MaybeValue;

import java.util.Set;

public interface Expression {

    MaybeValue evaluate(Set<Cell> visited);
    Set<Cell> references(Set<Cell> visited);
}
