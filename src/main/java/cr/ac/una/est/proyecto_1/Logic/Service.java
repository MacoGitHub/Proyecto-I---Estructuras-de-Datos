package cr.ac.una.est.proyecto_1.Logic;

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
}
