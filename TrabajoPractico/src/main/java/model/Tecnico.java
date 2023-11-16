package model;
import java.util.ArrayList;




public class Tecnico extends Usuario{

	private ArrayList<Especialidad> especialidades;

    private ArrayList<Incidente> incidentes;
    
    private int  tiempopordefecto;
    
    private Notificacion notificacion;
    
    
	public Tecnico(String nombre, int tiempopordefecto , Notificacion notificacion) {
		super(nombre);
		especialidades = new ArrayList<Especialidad>();
		incidentes = new ArrayList<Incidente>();
		this.tiempopordefecto = tiempopordefecto;
		this.notificacion = notificacion;
	
		
	}


	public ArrayList<Especialidad> getEspecialidades() {
		return especialidades;
	}


	public ArrayList<Incidente> getIncidentes() {
		return incidentes;
	}


	public int getTiempopordefecto() {
		return tiempopordefecto;
	}


	public Notificacion getNotificacion() {
		return notificacion;
	}


	public void setEspecialidades(ArrayList<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}


	public void setIncidentes(ArrayList<Incidente> incidentes) {
		this.incidentes = incidentes;
	}


	public void setTiempopordefecto(int tiempopordefecto) {
		this.tiempopordefecto = tiempopordefecto;
	}


	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}


	@Override
	public String toString() {
		return "Tecnico [especialidades=" + especialidades + ", incidentes=" + incidentes + ", tiempopordefecto=" + tiempopordefecto + ", notificacion=" + notificacion + "]";
	}









































































    
    

    

    
    
    

}
