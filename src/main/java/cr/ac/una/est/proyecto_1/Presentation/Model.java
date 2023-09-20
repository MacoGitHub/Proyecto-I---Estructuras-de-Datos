package cr.ac.una.est.proyecto_1.Presentation;

import java.util.Observer;
import cr.ac.una.est.proyecto_1.Logic.Colores;
import cr.ac.una.est.proyecto_1.Logic.Cola;

public class Model extends java.util.Observable {
    Cola _queue;
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
    public Cola getCola(){ return _queue; }
    public Colores getCurrent(){ return _current; }
    public int getMode(){ return _mode; }
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
}
