
package model;
import java.util.ArrayList;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity            
@NoArgsConstructor 

@Table(name="CLIENTE")
public class Cliente {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   
	 @Column(name="id")
	 private Long id;
	 
	 @Column(name="nombre")
	 private String nombre;
	 
	 @Column(name="razonSocial")
	 private String razonSocial;
	 
	 @Column(name="Cuit")
	 private String CUIT;
	 
	 
	 @OneToMany(mappedBy = "cliente")
	 private ArrayList<Servicio> servicioscontratados;
	
	 
	 
	 
	 
	 
	 
	 
	 
	 @Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", razonSocial=" + razonSocial + ", CUIT=" + CUIT
				+ ", servicioscontratados=" + servicioscontratados + "]";
	}
	 






	

	 
	

	 
	 
	 
}
