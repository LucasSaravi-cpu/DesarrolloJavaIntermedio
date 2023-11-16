
package model;
import java.util.ArrayList;


public class Cliente extends Usuario{


	 private String razonSocial;

	 private String CUIT;
	 private ArrayList<Servicio> servicioscontratados;
	 

	 public Cliente(String nombre, String razonSocial, String cUIT) {
		super(nombre);
		this.razonSocial = razonSocial;
		CUIT = cUIT;
		servicioscontratados = new ArrayList<Servicio>();
	}



	public String getRazonSocial() {
		return razonSocial;
	}





	public String getCUIT() {
		return CUIT;
	}



	public ArrayList<Servicio> getServicioscontratados() {
		return servicioscontratados;
	}



	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}




	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}



	public void setServicioscontratados(ArrayList<Servicio> servicioscontratados) {
		this.servicioscontratados = servicioscontratados;
	}






	@Override
	public String toString() {
		return super.toString()+" \t" + razonSocial + "\t " + CUIT + "\t  "+ servicioscontratados ;
	}
	
	
	

	 
	

	 
	 
	 
}
