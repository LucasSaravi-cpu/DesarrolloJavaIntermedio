package model;
import java.util.Random;

//El area comercial crearia clientes random

public class AreaComercial {
	
	    private static final String[] NOMBRES = {"Lucas", "Ana", "Pedro", "Mar�a", "Juan"};
	    private static final String[] RAZONSOCIAL = {"EMPRESA A", "EMPRESA B", "EMPRESA C", "EMPRESA D"};
	    private static final String[] CUIT = {"123456789", "1011121314", "555555555", "999999999"};

	
	
	 public Cliente AgregarCliente() {
		 
		 
	        Random random = new Random();
	        String nombre = NOMBRES[random.nextInt(NOMBRES.length)];
	        String razonsocial = RAZONSOCIAL[random.nextInt(RAZONSOCIAL.length)];
	        String cuit = CUIT[random.nextInt(CUIT.length)];

	        return new Cliente(nombre, razonsocial, cuit);
	    }

	 
	 //AreaComercial areaComercial = new AreaComercial();
    //Cliente clienteAleatorio = areaComercial.generarClienteAleatorio();
	 
	 
}
