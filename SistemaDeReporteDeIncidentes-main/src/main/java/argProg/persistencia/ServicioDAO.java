package argProg.persistencia;

import argProg.modelos.Servicio;

public class ServicioDAO extends DAO<Servicio>{
    public ServicioDAO(){
        setClaseEntidad(Servicio.class);
    }
}
