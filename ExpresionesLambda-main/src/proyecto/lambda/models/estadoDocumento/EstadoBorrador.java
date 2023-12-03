package proyecto.lambda.models.estadoDocumento;

import proyecto.lambda.models.Documento;

public class EstadoBorrador extends Estado{

	@Override
	public void aplicarTransicion(Documento doc) {
		
		if(this.cumpleCondicionParaCambiarDeEstado(doc))		
			doc.cambiarEstado(new EstadoRevisado());
	}
	
	private boolean cumpleCondicionParaCambiarDeEstado(Documento doc) {
		if(doc.isValidadoPorAutor())
			return true;
		
		return false;
	}
}
