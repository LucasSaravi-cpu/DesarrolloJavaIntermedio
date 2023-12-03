package proyecto.lambda.interfaces;

@FunctionalInterface
public interface Descuento {
	Double aplicar(Double monto);
}
