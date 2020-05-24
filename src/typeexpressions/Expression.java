package typeexpressions;

import typevalues.Cell;
import typevalues.MaybeValue;

import java.util.Set;

public interface Expression {

    MaybeValue evaluate();
    Set<Cell> references();
}
