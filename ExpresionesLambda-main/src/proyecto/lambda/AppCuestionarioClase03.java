package proyecto.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import proyecto.lambda.models.Persona;

public class AppCuestionarioClase03 {

	public static void main(String[] args) {
		
		List<Persona> listaDePersonas = new ArrayList<Persona>();
		listaDePersonas.add(new Persona("Nahuel",10));
		listaDePersonas.add(new Persona("Mateo",30));
		listaDePersonas.add(new Persona("Julia",12));
		
		Integer edadMinima = Collections.min(
				listaDePersonas.stream().map( unaPersona -> unaPersona.getEdad()).collect(Collectors.toList())
				);
		
		OptionalInt edadMinima2 = listaDePersonas.stream()
				.mapToInt( unaPersona -> unaPersona.getEdad())
				.min();
				
		/*
		 * EJERCICIO 1
			Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
			lista con los strings en mayúscula.

		 */
		
		List<String> frasesEnMinuscula = new ArrayList<String>();
		frasesEnMinuscula.add("una frase");
		frasesEnMinuscula.add("frase");
		frasesEnMinuscula.add("ult");
		
		List<String> frasesEnMayuscula = frasesEnMinuscula.stream()
				.map( frase -> frase.toUpperCase())
				.collect(Collectors.toList());
				
		/*
		 *
			EJERCICIO 2
			Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
			método debe devolver un String que concatene separando por coma y espacio todas las
			palabras, en la lista, que tengan más de "n" caracteres.
		 * 
		 */
		String stringConcatenado = concatenarStrings(frasesEnMinuscula, 4);
		
		System.out.println(stringConcatenado);
		
	}
	
	public static String concatenarStrings(List<String> frases, Integer longitud) {
		String concatenado = frases.stream()				
				.filter( frase -> frase.length() > longitud )
				.collect(Collectors.joining(", "));
		return concatenado;
	}

}
