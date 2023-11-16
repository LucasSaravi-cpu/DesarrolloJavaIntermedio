package model;
import java.util.Random;

public class Operador extends Usuario{

	public Operador(String nombre) {
		super(nombre);
	
	}
	
	public int AgregarHoras(boolean complejo) {
		
		int horas=0;
		
		if (complejo) {
			
		// Agrega de (0-23)+1	
	   Random random = new Random();
	   horas = random.nextInt(23)+1; 
		
		}
		
		return horas;
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	

}
