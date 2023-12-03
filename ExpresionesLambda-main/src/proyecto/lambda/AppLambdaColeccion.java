package proyecto.lambda;

import java.util.ArrayList;

public class AppLambdaColeccion {

	public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
 
        // lambda expression para imprimir todo
        numeros.forEach(n -> System.out.println(n));
 
        // lambda expression para imprimir pares
        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

	}

}
