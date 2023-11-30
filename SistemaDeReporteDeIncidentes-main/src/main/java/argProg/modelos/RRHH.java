package argProg.modelos;

import argProg.persistencia.IncidenteDAO;
import argProg.persistencia.TecnicoDAO;
import argProg.utilidades.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RRHH {
    //Realiza altas bajas y modificaciones de Tecnicos -> Necesita acceso a al tabla de Tecnicos
    //Debe informar el Tecnico con la mayor cantidad de Incidentes resueltos -> Tambien accede a la tabla Incidentes
    private TecnicoDAO tecnicoDAO = new TecnicoDAO();
    private IncidenteDAO incidenteDAO = new IncidenteDAO();
    private List<Tecnico> todosLosTecnicos = tecnicoDAO.buscarTodos();
    private List<Incidente> todosLosIncidentes = incidenteDAO.buscarTodos();

    public void darDeAltaTecnico(Tecnico tecnico) {
        tecnicoDAO.guardar(tecnico);
    }

    public void darDeBajaTecnico(Tecnico tecnico) {
        tecnicoDAO.eliminar(tecnico);
    }

    public void modificarTecnico(Tecnico tecnico) {
        tecnicoDAO.actualizar(tecnico);
    }

    public Tecnico buscarTecnicoPorId(Integer id){
        return tecnicoDAO.buscar(id);
    }
    public Tecnico buscarTecnicoConMayorCantidadDeResueltos() {
        /*TODO Devolver el Tecnico que tenga mayor cantidad de Incidentes resueltos
         *  esto lo voy a buscar en la tabla de incidentes que contiene tanto el ID del Tecnico
         *  como el ESTADO del incidente( "resuelto","no resuelto")*/
        EntityManager em = EntityManagerUtil.getEntityManager();
        TypedQuery<Incidente> query = em.createQuery("SELECT i FROM Incidente i",Incidente.class);
        List<Incidente> incidentes = new ArrayList<>();
        for (Incidente incidente : query.getResultList()) {
            if (incidente.getEstado() == "resuelto") {
                incidentes.add(incidente);
            }
        }
        System.out.println(incidentes);
        return null;
    }
    public List<Tecnico> buscarTodosLosTecnicos(){
        return tecnicoDAO.buscarTodos();
    }

}
