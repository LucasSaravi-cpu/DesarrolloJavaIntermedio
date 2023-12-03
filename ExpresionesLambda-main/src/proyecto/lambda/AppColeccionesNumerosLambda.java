package proyecto.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppColeccionesNumerosLambda {

	public static void main(String[] args) {
		
		//Crear una colección de números
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(2);

		//List<Integer> otrosNumeros = Arrays.asList(3,10,20,5);
		//List<Integer> listaNumeros = new ArrayList<Integer>(List.of(3,1,4));
		/*for(Integer unNumero : numeros) {
			System.out.println(unNumero);
		}*/
		//numeros.forEach( (numero) -> System.out.println(numero) );
		numeros.forEach( (numero) -> System.out.println(numero) );
		
		//Operar de manera masiva una condición
		/*
		 *  ANALOGÍA DE .stream().allMatch(
		boolean unBooleano = true;
		
		for(Integer unNumero : numeros) {
			if(unNumero <= 3)
				unBooleano = false;
		}
		*/
		boolean validacion = numeros.stream().allMatch( numero -> numero > 3);
		
		System.out.println("Ejemplo de stream().allMatch(): "+validacion);
		
		/*
		 *  ANALOGÍA DE .stream().anyMatch(
		boolean unBooleano = false;
		
		for(Integer unNumero : numeros) {
			if(unNumero > 3)
				unBooleano = true;
		}
		*/
		System.out.println("Ejemplo de stream().anyMatch(): "+numeros.stream().anyMatch( numero -> numero > 3));
		
		
	}

}
