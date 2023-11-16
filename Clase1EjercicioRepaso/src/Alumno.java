
public class Alumno {

	 private String nombre;
	    private String apellido;

	    public Alumno(String nombre, String apellido) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

		@Override
		public String toString() {
			return "Alumno " + nombre +"\t"+ " apellido " + apellido + "]";
		}
	    
	    
	    
	    
	    
	}





