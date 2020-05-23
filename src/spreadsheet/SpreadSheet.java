package spreadsheet;

import typeexpressions.Expression;
import typeexpressions.Plus;
import typevalues.MaybeValue;
import typevalues.Reference;
import typevalues.SomeValue;

public class SpreadSheet {
    private static int SIZE = 5;
    private static final Sheet SHEET = new Sheet(SIZE);

    public static Expression plus(Expression expr1, Expression expr2) {
        // Crea i retorna una expressió corresponent a la
        // suma de les dues subexpressions
        //TODO: implement this
        throw new UnsupportedOperationException();
    }

    public static Expression plus(Expression expr1, int value2) {
        // Crea i retorna una expressió corresponent a la
        // suma de expr1 i de l’expressió que representa
        // la constant value2
        //TODO: implement this
        throw new UnsupportedOperationException();
    }

    public static Expression plus(Expression expr1, String ref2) {
        // Crea i retorna una expressió corresponent a la
        // suma de expr1 i de l’expressió que representa
        // una referència a la cel·la amb nom ref2
        //TODO: implement this
        throw new UnsupportedOperationException();
    }

    public static Expression plus(int value1, Expression expr2) {
        //TODO: implement this
        throw new UnsupportedOperationException();
    }

    public static Expression plus(int value1, int value2) {
        //TODO: implement this
        throw new UnsupportedOperationException();
    }

    public static Expression plus(int value1, String ref2) {
        //TODO: implement this
        throw new UnsupportedOperationException();
    }

    public static Expression plus(String ref1, Expression expr2) {
        return new Plus(new Reference(SHEET.getCell(ref1)), expr2);
    }

    public static Expression plus(String ref1, int value2) {
        return new Plus(new Reference(SHEET.getCell(ref1)), new SomeValue(value2));
    }

    public static Expression plus(String ref1, String ref2) {
        return new Plus(new Reference(SHEET.getCell(ref1)),new Reference(SHEET.getCell(ref2)));
    }

    // El mateix per a totes les combinacions de mult

    public static MaybeValue get(String name) {
        return SHEET.get(name);
    }

    public static void put(String name, Expression expr) {
        SHEET.set(name,expr);

    }

    public static void put(String name, int value) {
        // Assigna a la cel·la amb nom name l’expressió
        // el valor value (Òbviament caldrà construir la
        // representació d’aquest int com typeexpressions.Expression).
        // Això pot provocar avaluacions d’aquesta o
        // d’altres cel·les
        SHEET.set(name,new SomeValue(value));
    }

    public static void put(String name, String refName) {
        // Assigna a la cel·la amb nom name la referència
        // a la cel·la amb nom refName (Òbviament caldrà
        // construir la representació d’aquesta
        // referència com typeexpressions.Expression).
        // Això pot provocar avaluacions d’aquesta o
        // d’altres cel·les

    }

    public static void clear() {
        // Esborra totes les cel·les del full de càlcul.

    }
}