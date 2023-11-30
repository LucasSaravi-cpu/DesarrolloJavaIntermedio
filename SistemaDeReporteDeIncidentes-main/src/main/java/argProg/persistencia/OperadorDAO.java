package argProg.persistencia;

import argProg.modelos.Operador;
import argProg.utilidades.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class OperadorDAO extends DAO<Operador> {

    public OperadorDAO(){
        setClaseEntidad(Operador.class);
    }
}
