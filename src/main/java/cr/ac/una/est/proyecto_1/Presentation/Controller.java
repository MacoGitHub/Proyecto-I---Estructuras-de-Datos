package cr.ac.una.est.proyecto_1.Presentation;

import cr.ac.una.est.proyecto_1.Logic.Service;

public class Controller {
    View _view;
    Model _model;
//------------------------------------------------------------------------------
    public Controller(View view, Model model){
        this._model = model;
        this._view = view;
        _view.setController(this);
        _view.setModel(_model);
    }
//------------------------------------------------------------------------------
    public boolean compareSequences(){ // Aqui quizas se podria comparar los colores del Current y de la cola.
        boolean compare = _model.getCola().contains(_model.getCurrent());
        if(compare) _model.commit();
        return compare;
    }
    public void createSequences(int cantSeq){
        _model.setCola(Service.instance().crearColores(cantSeq));
        _model.commit();
    }
    public void readSequences(){
        
    }
}
