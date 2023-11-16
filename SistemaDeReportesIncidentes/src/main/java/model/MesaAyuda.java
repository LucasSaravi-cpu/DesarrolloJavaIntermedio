package model;
import java.util.ArrayList;

public class MesaAyuda {
	
	

	  private ArrayList<Tecnico> tecnicos;
	  private Operador operador;

	public MesaAyuda(Operador operador) {
		super();
		this.operador = operador;	
		tecnicos = new ArrayList<Tecnico>();
		
	}

	public ArrayList<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setTecnicos(ArrayList<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	@Override
	public String toString() {
		return "MesaAyuda [tecnicos=" + tecnicos + ", operador=" + operador + "]";
	}

	

}

	

	

	  


