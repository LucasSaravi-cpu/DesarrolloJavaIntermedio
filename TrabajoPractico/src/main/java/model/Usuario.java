package model;




public class Usuario {
	
	
	
	private String nombre;
	
	
	public Usuario(String nombre) {
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
		return  nombre ;
	}


	
	

}
