package model;

public class Especialidad {
	
	 private String nombre;

	public Especialidad(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	@Override
	public String toString() {
		return nombre ;
	}
	 
	 

}
