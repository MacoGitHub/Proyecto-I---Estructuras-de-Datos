package cr.ac.una.est.proyecto_1.Logic;

import java.util.Queue;
import cr.ac.una.est.proyecto_1.Data.Data;

public class Service {
    private static Service _theInstance;
    private Data _data;
//------------------------------------------------------------------------------
    private Service(){
        _data = new Data();
    }
    public static Service instance(){
        if(_theInstance==null) _theInstance = new Service();
        return _theInstance;
    }
    public Queue<Colores> getQueueGame(){ return _data.getCola();}
//------------------------------------------------------------------------------
    public Queue<Colores> crearColores(int cantSec){
        Queue<Colores> aux = _data.getCola();
        
        for(int i=0;i<cantSec;i++){
            aux.add(new Colores());
        }
        
        for(Colores color : aux){
            color.generateColors();
        }
        
        return aux;
    }
    public void read(){ // No terminado...
        Queue<Colores> aux = _data.getCola();
        
        for(Colores color : aux){
            color.equals(aux.poll());
        }
    }
}
