package argProg.persistencia;

import argProg.modelos.Especialidad;

public class EspecialidadDAO extends DAO<Especialidad> {
    public EspecialidadDAO(){
        setClaseEntidad(Especialidad.class);
    }
}
