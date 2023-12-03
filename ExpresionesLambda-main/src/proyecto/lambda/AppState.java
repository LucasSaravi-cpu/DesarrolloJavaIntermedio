package proyecto.lambda;

import proyecto.lambda.models.Documento;

public class AppState {

	public static void main(String[] args) {

		//Crear una instancia de documento con estado Borrador, estado inicial
		Documento unaInstanciaDeDocumento = new Documento();
		
		//Ejecutamos sentencias relacionadas al documento
		unaInstanciaDeDocumento.setValidadoPorAutor(true);
		
		//Cambiar a estado revisado
		unaInstanciaDeDocumento.actuar();
		
		//Cambiar a estado publicado
		unaInstanciaDeDocumento.actuar();	

	}

}
