package proyecto.lambda.models;

import proyecto.lambda.models.estadoDocumento.Estado;
import proyecto.lambda.models.estadoDocumento.EstadoBorrador;

public class Documento {

	private Estado estado;
	
	private boolean validadoPorAutor;
	
	public Documento() {
		this.estado = new EstadoBorrador();
	}
	
	public void actuar() {
		this.estado.aplicarTransicion(this);
	}
	
	public void cambiarEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isValidadoPorAutor() {
		return validadoPorAutor;
	}

	public void setValidadoPorAutor(boolean validadoPorAutor) {
		this.validadoPorAutor = validadoPorAutor;
	}
	
}