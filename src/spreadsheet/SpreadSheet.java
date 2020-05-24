package spreadsheet;

import typeexpressions.Expression;
import typeexpressions.Mult;
import typeexpressions.Plus;
import typevalues.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SpreadSheet {
    private static int SIZE = 5;
    private static final Sheet SHEET = new Sheet(SIZE);

    public static Expression plus(Expression expr1, Expression expr2) {
        return new Plus(expr1, expr2);
    }

    public static Expression plus(Expression expr1, int value2) {
        return new Plus(expr1, new SomeValue(value2));
    }

    public static Expression plus(Expression expr1, String ref2) {
        return new Plus(expr1, new Reference(SHEET.getCell(ref2)));
    }

    public static Expression plus(int value1, Expression expr2) {
        return new Plus(new SomeValue(value1), expr2);
    }

    public static Expression plus(int value1, int value2) {
        return new Plus(new SomeValue(value1),new SomeValue(value2));
    }

    public static Expression plus(int value1, String ref2) {
        return new Plus(new SomeValue(value1), new Reference(SHEET.getCell(ref2)));
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

    public static Expression mult(Expression expr1, Expression expr2) {
        return new Mult(expr1, expr2);
    }

    public static Expression mult(Expression expr1, int value2) {
        return new Mult(expr1, new SomeValue(value2));
    }

    public static Expression mult(Expression expr1, String ref2) {
        return new Mult(expr1, new Reference(SHEET.getCell(ref2)));
    }

    public static Expression mult(int value1, Expression expr2) {
        return new Mult(new SomeValue(value1), expr2);
    }

    public static Expression mult(int value1, int value2) {
        return new Mult(new SomeValue(value1),new SomeValue(value2));
    }

    public static Expression mult(int value1, String ref2) {
        return new Mult(new SomeValue(value1), new Reference(SHEET.getCell(ref2)));
    }

    public static Expression mult(String ref1, Expression expr2) {
        return new Mult(new Reference(SHEET.getCell(ref1)), expr2);
    }

    public static Expression mult(String ref1, int value2) {
        return new Mult(new Reference(SHEET.getCell(ref1)), new SomeValue(value2));
    }

    public static Expression mult(String ref1, String ref2) {
        return new Mult(new Reference(SHEET.getCell(ref1)),new Reference(SHEET.getCell(ref2)));
    }


    public static MaybeValue get(String name) {
        Cell cell = SHEET.getCell(name);
        return cell.get();
    }

    public static void put(String name, Expression expr) {
        Cell cell = SHEET.getCell(name);
        cell.set(expr);
        Iterator<Cell> it = cell.references(true).iterator();
        cell.clearSubjects();
        while(it.hasNext()){
            cell.addSubject(it.next());
        }
    }

    public static void put(String name, int value) {
        Cell cell = SHEET.getCell(name);
        cell.set(new SomeValue(value));
        Iterator<Cell> it = cell.references(true).iterator();
        cell.clearSubjects();
        while(it.hasNext()){
            cell.addSubject(it.next());
        }
    }

    public static void put(String name, String refName) {
        Cell cell = SHEET.getCell(name);
        cell.set(new Reference(SHEET.getCell(refName)));
        Iterator<Cell> it = cell.references(true).iterator();
        cell.clearSubjects();
        while(it.hasNext()){
            cell.addSubject(it.next());
        }

    }

    public static void clear() {
        int indexChar = 97;
        for(int i = 0 ; i < SIZE ; i++){
            for(int j = 1 ; j <= SIZE ; j++){
                String text = Character.toString((char)indexChar+i);
                text += j;
                Cell cell = SHEET.getCell(text);
                cell.set(NoValue.getNoValue());
            }
        }
    }
}