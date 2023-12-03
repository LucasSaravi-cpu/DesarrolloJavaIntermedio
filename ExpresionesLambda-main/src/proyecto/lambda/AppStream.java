package proyecto.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import proyecto.lambda.interfaces.Persona;

public class AppStream {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona(10));
		listaPersonas.add(new Persona(20));
		listaPersonas.add(new Persona(40));
		
		OptionalDouble promedioDeEdad = listaPersonas.stream()
				.mapToInt(Persona::getEdad).average();
		
		Integer sumaTotalDeEdadesUsandoLambda = listaPersonas.stream()
				.mapToInt(unaPersona -> unaPersona.getEdad())
				.sum();
		
		OptionalInt suma = listaPersonas.stream()
				.mapToInt(Persona::getEdad)
				.reduce((a,b)-> a + b);
		
	}

}
