package model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity     

@Table(name="SERVICIO")

public class Servicio {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   //generará automáticamente un valor único para la clave principal
	 @Column(name="id")
	 private Long id;
	 
	 @Column(name="nombre")
	 private String nombre;
	 
	 @Column(name="descripcion")
	 private String descripcion;
	
	 


	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	
	
	 
	 
	 

}
