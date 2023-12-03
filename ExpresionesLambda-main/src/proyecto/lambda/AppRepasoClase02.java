package proyecto.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import proyecto.lambda.interfaces.ToUppercaseLambda;

public class AppRepasoClase02 {

	public static void main(String[] args) {
		
		//Creamos una lista de String con elementos de ejemplo
		List<String> frasesEjemplo = new ArrayList<String>();
		
		frasesEjemplo.add("Una frase");
		frasesEjemplo.add("otra frase");
		frasesEjemplo.add("ultima frase");
		
		//Creamos una listas de String que es la que va a recibir la lista transformada en mayusculas
		List<String> frasesEnMayuscula = new ArrayList<String>();
		
		//Una interfaz funcional nos permite asignar una expresión lambda a justamente la interfaz
		ToUppercaseLambda expresionLambda = frases -> {
			List<String> otraListaConMayusculas = new ArrayList<String>();
			for(String frase : frases) {
				otraListaConMayusculas.add(frase.toUpperCase());
			}
			return otraListaConMayusculas;
		};
		
		frasesEnMayuscula = expresionLambda.paseAMayuscula(frasesEjemplo);
		
		//(PARAMETROS) -> (COMPORTAMIENTO);
		frasesEnMayuscula.forEach( elemento -> System.out.println(elemento));
				
		//frases.forEach( frase -> otraLista.add(frase.toUpperCase()));
		frasesEjemplo.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());		
	}
	
	List<String> metodoJavaAnalogoAlEjercicio(List<String> frases){
		List<String> otraListaConMayusculas = new ArrayList<String>();
		for(String frase : frases) {
			otraListaConMayusculas.add(frase.toUpperCase());
		}
		return otraListaConMayusculas;
	}

}
