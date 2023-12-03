package proyecto.lambda.interfaces;

import java.util.List;

@FunctionalInterface
public interface ToUppercaseLambda {

	/*
	 * Implemente un método que reciba como parámetro una lista de strings y una interfaz
funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
nuevo listado de String transformados.

	 */
	List<String> paseAMayuscula(List<String> listaDeStrings);
}