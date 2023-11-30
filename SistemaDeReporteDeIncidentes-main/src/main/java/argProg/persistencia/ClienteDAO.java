package argProg.persistencia;

import argProg.modelos.Cliente;
import argProg.utilidades.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ClienteDAO extends DAO<Cliente>{

    public ClienteDAO(){
        this.setClaseEntidad(Cliente.class);
    }
    public Cliente buscarPorCuit(String cuitCliente){

        EntityManager em = EntityManagerUtil.getEntityManager();
        TypedQuery<Cliente> buscarPorCuit = em.createNamedQuery("Cliente_buscarPorCuit",Cliente.class);
        buscarPorCuit.setParameter("cuitCliente",cuitCliente);

        return buscarPorCuit.getSingleResult();
    }
    public Cliente buscarPorRazonSocial(String razonSocial){

        EntityManager em = EntityManagerUtil.getEntityManager();
        TypedQuery<Cliente> buscarPorCuit = em.createNamedQuery("Cliente_buscarPorRazonSocial",Cliente.class);
        buscarPorCuit.setParameter("razonSocial",razonSocial);

        return buscarPorCuit.getSingleResult();
    }
}
