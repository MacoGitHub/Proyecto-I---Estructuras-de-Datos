package cr.ac.una.est.proyecto_1.Presentation;



public class Controller {
    View _view;
    Model _model;
    
    public Controller(View view, Model model){
        this._model = model;
        this._view = view;
        _view.setController(this);
        _view.setModel(_model);
    }
}
