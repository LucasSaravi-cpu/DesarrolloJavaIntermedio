/*TRANSFORMADOR
Implemente un método que reciba como parámetro una lista de strings y una interfaz
funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
nuevo listado de String transformados.
*/


import java.util.ArrayList;
import java.util.List;

public class AppTransformar {

	public static void main(String[] args) {
		
		 ArrayList<Persona> listaPersonas = new ArrayList<>();
		 
		 Persona persona1 = new Persona("lucas");
		 Persona persona2 = new Persona("mariano");
		 Persona persona3 = new Persona("rodrigo");
		 Persona persona4 = new Persona("marcos");
		 
		 listaPersonas.add(persona1);
		 listaPersonas.add(persona2);
		 listaPersonas.add(persona3);
		 listaPersonas.add(persona4);
		 
		 
		    // Definir una expresión lambda que transforme el nombre de una Persona a mayúsculas
	        Transformar transformarAMayusculas = nom -> nom.toUpperCase();

	        // Aplicar la transformación y obtener la lista resultante
	        List<Persona> listaPersonasMayusculas = transformarNombresAMayusculas(listaPersonas, transformarAMayusculas);

	       
	        listaPersonasMayusculas.forEach(persona -> System.out.println(persona.toString()));
		

	}

	
	
	
	//Este es el metodo que resive la lista y el metodo de una interfaz funcional que transforma el nombre en mayuscula .
	 public static List<Persona> transformarNombresAMayusculas(List<Persona> personas, Transformar transformador) {
		 
	        personas.forEach(persona -> persona.setNombre(transformador.transform(persona.getNombre())));
	        
	        return personas; //Devuelve los datos de las perosnas en mayuscula 
	    }





}



	

	


