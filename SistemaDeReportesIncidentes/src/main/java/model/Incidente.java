package model;
import java.util.ArrayList;
import java.util.Date;

public class Incidente {
	
	
    private Cliente cliente;
    private Servicio servicio;
    private String DescripcionIncidente;
    private String estado;
    private Date fechaPosibleResolucion;
    private Date fechaFinalizacion;
    private boolean complejo;
	private ArrayList<TipoProblema> tiposdeproblema;
    
    
	public Incidente(Cliente cliente, Servicio servicio, String descripcionIncidente, 
			 String estado,Date fechaPosibleResolucion,Date fechaFinalizacion,boolean complejo) {
		super();
		this.cliente = cliente;
		this.servicio = servicio;
		this.DescripcionIncidente = descripcionIncidente;
		
		this.estado = estado;
		this.fechaPosibleResolucion = fechaPosibleResolucion;
		this.fechaFinalizacion= fechaFinalizacion;
		this.complejo=complejo;
		tiposdeproblema = new ArrayList<TipoProblema>();
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Servicio getServicio() {
		return servicio;
	}


	public String getDescripcionIncidente() {
		return DescripcionIncidente;
	}


	public String getEstado() {
		return estado;
	}


	public Date getFechaPosibleResolucion() {
		return fechaPosibleResolucion;
	}


	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}


	public boolean isComplejo() {
		return complejo;
	}


	public ArrayList<TipoProblema> getTiposdeproblema() {
		return tiposdeproblema;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}


	public void setDescripcionIncidente(String descripcionIncidente) {
		DescripcionIncidente = descripcionIncidente;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void setFechaPosibleResolucion(Date fechaPosibleResolucion) {
		this.fechaPosibleResolucion = fechaPosibleResolucion;
	}


	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}


	public void setComplejo(boolean complejo) {
		this.complejo = complejo;
	}


	public void setTiposdeproblema(ArrayList<TipoProblema> tiposdeproblema) {
		this.tiposdeproblema = tiposdeproblema;
	}


	@Override
	public String toString() {
		return "Incidente [cliente=" + cliente + ", servicio=" + servicio + ", DescripcionIncidente="
				+ DescripcionIncidente + ", estado=" + estado + ", fechaPosibleResolucion=" + fechaPosibleResolucion
				+ ", fechaFinalizacion=" + fechaFinalizacion + ", complejo=" + complejo + ", tiposdeproblema="
				+ tiposdeproblema + "]";
	}


	
    



}
