package cr.ac.una.est.proyecto_1.Logic;

import java.util.Queue;
import java.util.Comparator;
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
//    public Queue<Colores> crearColores(int cantSec){
//        Queue<Colores> aux = _data.getCola();
//        
//        for(int i=0;i<cantSec;i++){
//            aux.add(new Colores());
//        }
//        
//        for(Colores color : aux){
//            color.generateColors();
//        }
//        
//        return aux;
//    }
    public void create(Colores color) throws Exception{
        Colores aux = _data.getCola().stream().filter(i->i.getColor1()
                .equals(color.getColor1())).findFirst().orElse(null);
        if(aux==null) _data.getCola().add(color);
        else throw new Exception("Color no existe");
    }
    public Colores read(Colores color) throws Exception{
//        Queue<Colores> aux = _data.getCola();
//        
//        for(int i=0;i<aux.size();i++)
//            if(!color.equals(aux.poll()))
//                return false;
//        
//        return true;
        
        Colores aux = _data.getCola().stream().filter(i->i.getColor1()
                .equals(color.getColor1())).findFirst().orElse(null);
        if(aux!=null) return aux;
        else throw new Exception("Color no existe");
    }
    public void update(Colores color) throws Exception{
        Colores result;
        
        try{
            result = this.read(color);
            _data.getCola().remove(result);
            _data.getCola().add(color);
        } catch(Exception ex){
            throw new Exception("Tipo no existe");
        }
    }
    public Queue<Colores> delete(Colores e) throws Exception{
        Queue<Colores> nueva = _data.getCola();
        if(nueva.remove(e)){
            return nueva;
        }else{
            throw new Exception("Color no existe");
        }
     }
//    public Queue<Colores> search(Colores e){
//        return _data.getCola().stream()
//                .filter(i->i.getColor1().contains(e.getColor1()))
//                .sorted(Comparator.comparing(Colores::getColor1))
//    }
    
    public Queue<Colores> getTipos(){
        return _data.getCola();
     }
}
