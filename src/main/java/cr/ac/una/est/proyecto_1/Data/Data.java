package cr.ac.una.est.proyecto_1.Data;

import java.util.LinkedList;
import java.util.Queue;
import cr.ac.una.est.proyecto_1.Logic.Colores;

public class Data {
    private Queue<Colores> _gameQueue;
//------------------------------------------------------------------------------
    public Data(){
        _gameQueue = new LinkedList();
    }
    
    public void setCola(Queue<Colores> obj){_gameQueue = obj;}
    public Queue<Colores> getCola(){ return _gameQueue; }
}
