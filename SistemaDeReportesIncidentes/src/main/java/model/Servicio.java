package model;

public class Servicio {


	 private String nombre;
	 private String descripcion;
	
	 
	public Servicio(String nombre ,String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		
	}


	public String getNombre() {
		return nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	
	
	 
	 
	 

}
