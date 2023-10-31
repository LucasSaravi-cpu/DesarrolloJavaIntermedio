import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

	private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada(List<Materia> materiasAprobadas) {
        
    	List<Materia> cp = new ArrayList<>(materia.getCorrelativas());

        // Comprueba si todas las correlativas están aprobadas
        for (Materia correlativa : materiasAprobadas) {
            cp.remove(correlativa);
        }

        return cp.isEmpty();
    }

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
    
    
    
}

