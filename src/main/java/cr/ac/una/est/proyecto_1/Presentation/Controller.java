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
//    public void createSequences(int cantSeq){
//        _model.setCola(Service.instance().crearColores(cantSeq));
//        _model.commit();
//    }
//    public boolean readSequences(){
//        return Service.instance().read(_model.getCurrent());
//    }
}
