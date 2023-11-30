package argProg.persistencia;

import argProg.modelos.Tecnico;

public class TecnicoDAO extends DAO<Tecnico>{
    public TecnicoDAO(){
        this.setClaseEntidad(Tecnico.class);
    }
    public TecnicoDAO(Class<Tecnico> estaClase){
        this.setClaseEntidad(estaClase);
    }
}
