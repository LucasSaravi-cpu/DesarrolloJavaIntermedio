package proyecto.lambda.interfaces;

//Una interfaz funcional es aquella que declara un único método abstracto. 
//Con el uso de la anotación, que se agrega en el ejemplo, 
//se puede prevenir este error en tiempo de ejecución.
@FunctionalInterface
public interface Suma {
	
	int sumar(int unNumero, int otroNumero);

}
