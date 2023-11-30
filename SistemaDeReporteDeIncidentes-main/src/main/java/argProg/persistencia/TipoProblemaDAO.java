package argProg.persistencia;

import argProg.modelos.TipoProblema;

public class TipoProblemaDAO extends DAO<TipoProblema>{
    public TipoProblemaDAO(){
        setClaseEntidad(TipoProblema.class);
    }
}
