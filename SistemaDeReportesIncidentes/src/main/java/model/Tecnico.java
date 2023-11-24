package model;
import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@NoArgsConstructor
@Entity  

@Table(name="TECNICO")
public class Tecnico {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   
	 @Column(name="id")
	 private Long id;
	 
	 
	 
	 @OneToMany(mappedBy = "tecnico")
	 private ArrayList<Especialidad> especialidades;

	 @OneToMany(mappedBy = "tecnico")
	 private ArrayList<Incidente> incidentes;
    
    @Column(name="tiempopordefecto")
	 private int  tiempopordefecto;

	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", especialidades=" + especialidades + ", incidentes=" + incidentes
				+ ", tiempopordefecto=" + tiempopordefecto + "]";
	}
    

    
    


	
}



























































