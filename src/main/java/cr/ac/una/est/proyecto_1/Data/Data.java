package cr.ac.una.est.proyecto_1.Data;

import cr.ac.una.est.proyecto_1.Logic.Cola;

public class Data {
    private Cola _gameQueue;
//------------------------------------------------------------------------------
    public Data(){
        _gameQueue = new Cola();
    }
    public Cola getQueue(){ return _gameQueue; }
}
