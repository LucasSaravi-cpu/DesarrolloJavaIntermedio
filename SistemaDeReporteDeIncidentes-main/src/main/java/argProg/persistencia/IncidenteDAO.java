package argProg.persistencia;
import argProg.modelos.Incidente;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.time.LocalDate;

public class IncidenteDAO extends DAO<Incidente>{
    public IncidenteDAO(){
        this.setClaseEntidad(Incidente.class);
    }
    public List<Incidente> buscarResueltos(){
        TypedQuery<Incidente> buscarResueltos = getEm().createNamedQuery("Incidente_buscarResueltos",Incidente.class);
        return buscarResueltos.getResultList();
    }
    public List<Incidente> buscarIncidentesResueltosEntreFechas(LocalDate startDate, LocalDate endDate) {
        String jpql = "SELECT inci FROM Incidente inci WHERE inci.fechaFinalizacion BETWEEN :startDate AND :endDate AND inci.estado = \"resuelto\"";

        Query query = getEm().createQuery(jpql);
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);

        return query.getResultList();
    }
}
