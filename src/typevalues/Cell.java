/*
Genís Graus Qui – 47698407H
Adrián Lorenzo Plaza - 49259506S
Jesús Fernández Cid de Rivera - 48053542X
 */
package typevalues;

import typeexpressions.Expression;

import java.util.*;

public class Cell extends Observable implements Observer {

    private Expression exp;
    private MaybeValue val;
    private List<Cell> subjects = new ArrayList<Cell>();

    public void clearSubjects(){
        this.subjects.clear();
    }

    public void addSubject(Cell subject) {
        subject.addObserver(this);

    }

    public void set(Expression _exp){
        this.exp = _exp;
        evaluate(new HashSet<>());
        setChanged();
        notifyObservers();
    }

    public MaybeValue evaluate(Set<Cell> visited){
        if(!visited.contains(this)){
            visited.add(this);
            val = exp.evaluate(visited);
        }
        return val;
    }

    public MaybeValue get(){
        return  val;
    }

    public Set<Cell> references(Boolean first, Set<Cell> visited) {
        Set<Cell> setCell = new HashSet<>();
        if(!visited.contains(this)) {
            visited.add(this);
            Iterator<Cell> it = exp.references(visited).iterator();
            while (it.hasNext()) {
                setCell.add(it.next());
            }
            if (!first) setCell.add(this);
        }else{
            setCell.add(this);
        }

        return setCell;
    }

    @Override
    public void update(Observable o, Object arg) {
        evaluate(new HashSet<Cell>());
    }
}
