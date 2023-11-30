package argProg.modelos;

import argProg.persistencia.ClienteDAO;
import argProg.persistencia.IncidenteDAO;

import java.util.List;
import java.time.LocalDate;

public class MesaDeAyuda {
    /*
    la mesa de ayuda es responsable de atender las llamadas e ingresar al sistema los
    incidentes reportados -> Necesita acceso a la tabla Cliente y a la tabla Incidentes.
    */
    private ClienteDAO clienteDAO = new ClienteDAO();
    private IncidenteDAO incidenteDAO = new IncidenteDAO();


    public Cliente buscarDatosCliente(String razonSocial,String cuit) {
        Cliente cliente = clienteDAO.buscarPorCuit(cuit);
        return cliente;
    }


    public void reportarIncidente(Incidente incidente){
    }


    public void crearIncidente(Incidente incidente){
        List<Tecnico> tecnicos_disponibles = this.consultarTecnicosDisponibles();
        incidenteDAO.guardar(incidente);
    }


    public List<Tecnico> consultarTecnicosDisponibles(){
        List<Tecnico> tecnicos_disponibles = null;
        return tecnicos_disponibles;
    }


    public void informarCliente(){
    }

    public List<Incidente> buscarTodosLosIncidentesResueltos(){
        return incidenteDAO.buscarResueltos();
    }
    public List<Incidente> buscarIncidentesResueltosEntreFechas(LocalDate fechaInic, LocalDate fechaFin){
        return incidenteDAO.buscarIncidentesResueltosEntreFechas(fechaInic,fechaFin);
    }
}
