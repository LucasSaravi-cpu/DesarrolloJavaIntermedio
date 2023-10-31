import java.util.ArrayList;
import java.util.List;

public class Materia {

	private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        correlativas = new ArrayList<>();
    }

    public void agregarCorrelativa(Materia correlativa) {
        correlativas.add(correlativa);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public String getNombre() {
        return nombre;
    }

	@Override
	public String toString() {
		return "Materia " + nombre +"\n"+ " correlativas " + correlativas ;
	}
    
    
    
    
}

