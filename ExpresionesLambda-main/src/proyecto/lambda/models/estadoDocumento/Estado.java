package proyecto.lambda.models.estadoDocumento;

import proyecto.lambda.models.Documento;

public abstract class Estado {
	
	public abstract void aplicarTransicion(Documento doc);
	
}
