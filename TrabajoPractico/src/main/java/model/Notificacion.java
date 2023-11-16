package model;

public class Notificacion {
    
	private String tipo;
	private String descripcion;
	
	
	public Notificacion(String tipo, String descripcion) {
		super();
		this.tipo = tipo;
		this.descripcion = descripcion;
	}


	public String getTipo() {
		return tipo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Notificacion [tipo=" + tipo + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
	
}
