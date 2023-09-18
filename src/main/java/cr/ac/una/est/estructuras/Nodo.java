package cr.ac.una.est.estructuras;
import cr.ac.una.est.proyecto_1.Colores;

public class Nodo {
    private Colores _ptr;
    private Nodo _siguiente;
    //--------------------------------------------------------------------------
    public Nodo(){
        _ptr = null;
        _siguiente = null;
    }
    public Nodo(Colores ptr, Nodo siguiente){
        _ptr = ptr;
        _siguiente = siguiente;
    }
    public void setPtr(Colores ptr){
        _ptr = ptr;
    }
    public Colores getPtr(){
        return _ptr;
    }
    public void setSiguiente(Nodo siguiente){
        _siguiente = siguiente;
    }
    public Nodo getSiguiente(){
        return _siguiente;
    }
}
