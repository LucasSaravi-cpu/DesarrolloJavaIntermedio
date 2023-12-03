package proyecto.lambda;

import proyecto.lambda.interfaces.Suma;

public class AppSuma {

	public static void main(String[] args) {

		//Las expresiones Lambda pueden ser asignadas a variables.
		Suma lambdaSuma = (unNumero, otroNumero) -> unNumero + otroNumero;
		
		int unNumero = 3;
		int otroNumero = 5;
		
		int resultadoSuma = lambdaSuma.sumar(unNumero, otroNumero);
		
		System.out.println(resultadoSuma);

	}

}
