package cr.ac.una.est.proyecto_1.Presentation;

import cr.ac.una.est.proyecto_1.Logic.Service;

public class Controller {
    View _view;
    Model _model;
    
    public Controller(View view, Model model){
        this._model = model;
        this._view = view;
        _view.setController(this);
        _view.setModel(_model);
    }
//------------------------------------------------------------------------------
    public boolean compareSequences(){ // Aqui quizas se podria comparar los colores del Current y de la cola.
        return _model.getCola().contains(_model._current);
    }
    public void createSequences(int cantSeq){
        _model.setCola(Service.instance().crearColores(cantSeq));
    }
}
