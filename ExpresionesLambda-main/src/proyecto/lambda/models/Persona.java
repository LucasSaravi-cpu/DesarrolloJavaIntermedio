package proyecto.lambda.models;

public class Persona {

	private Integer edad;
	private String nombre;
	
	public Persona(String nombre) {
		this.setNombre(nombre);
	}
	
	public Persona(String nombre, Integer edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
