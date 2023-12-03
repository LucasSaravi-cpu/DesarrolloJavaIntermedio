package proyecto.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AppPersonas {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona(10));   
		listaPersonas.add(new Persona(20));
		listaPersonas.add(new Persona(30));
		
		Integer sumaTotalDeEdadesDeLasPersonas = 
				listaPersonas.stream()
				.mapToInt( unaPersona -> unaPersona.getEdad() )
				.sum();
		
		OptionalDouble promedioDeEdadesDeLasPersonas = listaPersonas.stream()
				//Me quedo con una coleccion de numeros
				.mapToInt( unaPersona -> unaPersona.getEdad() )
				.average();
		
	}

}
