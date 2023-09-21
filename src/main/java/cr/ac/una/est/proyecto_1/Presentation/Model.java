package cr.ac.una.est.proyecto_1.Presentation;

import java.util.Observer;
import cr.ac.una.est.proyecto_1.Logic.Colores;
//import cr.ac.una.est.proyecto_1.Logic.Cola;
import java.util.LinkedList;
import java.util.Queue;

public class Model extends java.util.Observable {
    Queue _queue;
    Colores _current;
    int _mode = 1;
    int _changedProps;
//------------------------------------------------------------------------------
    public static int NONE=0;
    public static int LIST=1;
    public static int CURRENT=2;
//------------------------------------------------------------------------------
    public Model(){
    }
    public void setCola(Queue queue) {this._queue = queue;}
    public Queue getCola(){ return _queue; }
    public void setCurrent(Colores current){this._current = current;}
    public Colores getCurrent(){ return _current; }
    public void setMode(int mode){this._mode = mode;}
    public int getMode(){ return _mode; }
    public void setChangedProps(int changedProps){ this._changedProps = changedProps;}
    public int getChangedProps(){ return _changedProps; }
//------------------------------------------------------------------------------
    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        commit();
    }
    public void commit(){
        setChanged();
        notifyObservers(_changedProps);
        _changedProps = NONE;
    }
//------------------------------------------------------------------------------
    
}
