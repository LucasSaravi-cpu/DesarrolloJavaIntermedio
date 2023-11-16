package model;

public class TipoProblema {
	
	private String nombre; 
	private String descripcion;
	private int tiempoMaximoResolucion;
	
	public TipoProblema(String nombre,String descripcion, int tiempoMaximoResolucion) { 
		this.nombre = nombre;
		this.tiempoMaximoResolucion = tiempoMaximoResolucion; 
		this.descripcion = descripcion;
		}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getTiempoMaximoResolucion() {
		return tiempoMaximoResolucion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTiempoMaximoResolucion(int tiempoMaximoResolucion) {
		this.tiempoMaximoResolucion = tiempoMaximoResolucion;
	}

	@Override
	public String toString() {
		return "TipoProblema [nombre=" + nombre + ", descripcion=" + descripcion + ", tiempoMaximoResolucion="
				+ tiempoMaximoResolucion + "]";
	}


	
	
	
	
}


