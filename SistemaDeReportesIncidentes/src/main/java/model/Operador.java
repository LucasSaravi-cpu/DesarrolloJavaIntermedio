package model;
import java.util.Random;
import javax.persistence.*; // el .* es para importar todos las persistencias 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter             //Genera los getter y setter 
@Setter
@Entity            //El entity significa que va a persistir en la base de datos 
@NoArgsConstructor //Genera el constructor 

@Table(name="OPERADOR")


public class Operador {
	
	
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   //generará automáticamente un valor único para la clave principal
	 @Column(name="id")
	 private Long id;
	 
	 @Column(name="nombre")
	 private String nombre;

	
	
	
	
	public int AgregarHoras(boolean complejo) {
		
		int horas=0;
		
		if (complejo) {
			
		// Agrega de (0-23)+1	
	   Random random = new Random();
	   horas = random.nextInt(23)+1; 
		
		}
		
		return horas;
		
	}








	
	
	

}
