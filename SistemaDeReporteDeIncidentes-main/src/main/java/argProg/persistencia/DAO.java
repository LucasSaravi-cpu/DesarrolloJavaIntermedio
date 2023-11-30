package argProg.persistencia;

import argProg.utilidades.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

import java.util.List;

public class DAO<T> {
    private Class<T> claseEntidad;
    private final EntityManager em = EntityManagerUtil.getEntityManager();
    public void guardar(T entidad) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(entidad);
        transaction.commit();

    }
    public
    void actualizar(T entidad){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        T entidadActualizada = em.merge(entidad);
        transaction.commit();

    }

    public
    void eliminar(T entidad){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(entidad);
        transaction.commit();

    }
    @Transactional
    public T buscar(int id){
        return em.find(this.claseEntidad,id);
    }

    public List<T> buscarTodos(){
        String sql = String.format("SELECT c FROM %s c", this.claseEntidad.getSimpleName() );
        System.out.println(sql);
        Query buscarTodos = em.createQuery(sql);
        return buscarTodos.getResultList();
    }

    public void setClaseEntidad(Class<T> clase ){
        this.claseEntidad = clase;
    };

    public EntityManager getEm(){
        return this.em;
    }
}
