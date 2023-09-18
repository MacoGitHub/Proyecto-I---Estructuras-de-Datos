package cr.ac.una.est.estructuras;
import cr.ac.una.est.proyecto_1.Colores;

public class Cola {
   private Nodo _inicio;
    private Nodo _final;
    //--------------------------------------------------------------------------
    public Cola(){
        _inicio = null;
        _final = null;
    }
    public boolean empty(){
        return _inicio == null;
    }
    public void add(Colores obj){
        Nodo nuevo = new Nodo();
        nuevo.setPtr(obj);
        nuevo.setSiguiente(null);
        
        if(empty()){
            _inicio = nuevo;
            _final = nuevo;
        } else {
            _final.setSiguiente(nuevo);
            _final = nuevo;
        }
    }
    public Colores remove(){
        if(!empty()){
            Colores colors = _inicio.getPtr();
            
            if(_inicio == _final){
                _inicio = null;
                _final = null;
            } else {
                _inicio = _inicio.getSiguiente();
            }
            
            return colors;
        } else{
            throw new IndexOutOfBoundsException();
        }
    }
    public String showQueue(){
        Nodo aux = _inicio;
        StringBuilder sb = new StringBuilder();
        
        while(aux != null){
            sb.append(aux.getPtr().toString());
            aux = aux.getSiguiente();
        }
        
        return sb.toString();
    } 
}
