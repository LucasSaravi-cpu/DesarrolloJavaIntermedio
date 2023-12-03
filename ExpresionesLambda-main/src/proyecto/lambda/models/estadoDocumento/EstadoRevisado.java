package proyecto.lambda.models.estadoDocumento;

import proyecto.lambda.models.Documento;

public class EstadoRevisado extends Estado{

	@Override
	public void aplicarTransicion(Documento doc) {
		
		if(this.cumpleCondicionParaCambiarDeEstado(doc))
			doc.cambiarEstado(new EstadoPublicado());
		
	}	
	
	private boolean cumpleCondicionParaCambiarDeEstado(Documento doc) {
		if(doc.isValidadoPorAutor())
			return true;
		else
			doc.cambiarEstado(new EstadoBorrador());
		return false;
	}
	
}
