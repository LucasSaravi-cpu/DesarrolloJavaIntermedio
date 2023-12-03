package proyecto.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import proyecto.lambda.interfaces.Persona;

public class AppStreamMap {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona(10, "Nahuel"));
		personas.add(new Persona(20, "Mateo"));
		personas.add(new Persona(30, "Julia"));
		
		//Transformar esta lista de personas a una lista de números, y los números serían edades
		
		OptionalDouble promedioDeEdad = personas.stream()
				//le indico a que tipo de dato quiero transformar
				.mapToInt( persona -> persona.getEdad() )
				//indico que hacer con la coleccion de numeros
				.average();
				
		Integer sumaDeEdades = personas.stream().mapToInt( persona -> persona.getEdad() ).sum();
		
		//A partir de personas, me quedo con una lista de nombres
		List<String> nombreDeLasPersonas = personas.stream()
				//transformo la coleccion de personas, y me quedo solo con los nombres
				.map( unaPersona -> unaPersona.getNombre())
				//trasnformalo a una lista
				.collect(Collectors.toList());
				
		//A partir de un listado de nombres, creo un listado de personas
		List<Persona> obtenerListadoDePersonasAPartirDeNombres =
				nombreDeLasPersonas.stream()
				.map( nombrePersona -> new Persona(nombrePersona))
				.collect(Collectors.toList());
		
		//Con la edad, el numero o el valor de la edad mayor
		//Paso y transformo una lista de personas a edades
		List<Integer> listaDeEdades =
				personas.stream()
				.map( unaPersona -> unaPersona.getEdad())
				.collect(Collectors.toList());
		
		//Aplanación de colecciones
		Integer edadMaxima = Collections.max(listaDeEdades);
		
		OptionalInt edadMaximaUsandoStream =
				personas.stream()
				.mapToInt( unaPersona -> unaPersona.getEdad())
				.max();
		
		List<String> textos = new ArrayList<>();
		textos.add( "Primero");
		textos.add( "Segundo");
		textos.add( "Tercero");
		
		String textoResultante = textos.stream().collect(Collectors.joining(", "));
		System.out.println(textoResultante);

	}

}
