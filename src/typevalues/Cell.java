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
        this.subjects.add(subject);

    }
    public void set(Expression _exp){
        this.exp = _exp;
        evaluate();
        setChanged();
        notifyObservers();
    }
    public MaybeValue evaluate(){
        if(subjects.contains(this)){
            val = NoValue.getNoValue();
        }
        else val = exp.evaluate();
        return val;
    }

    public MaybeValue get(){
        return  val;
    }

    public Set<Cell> references(Boolean first) {
        Set<Cell> setCell = new HashSet<>();
        Iterator<Cell> it = exp.references().iterator();
        while(it.hasNext()){
            setCell.add(it.next());
        }
        if(!first) setCell.add(this);


        return setCell;
    }
    @Override
    public void update(Observable o, Object arg) {
        evaluate();
    }
}
