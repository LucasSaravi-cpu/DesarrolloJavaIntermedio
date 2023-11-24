package model;



import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@Entity  

@Table(name="TIPO PROBLEMA")

public class TipoProblema {
	
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   
	 @Column(name="id")
	 private Long id;
	 @Column(name="nombre")
	private String nombre; 
	 @Column(name="descripcion")
	private String descripcion;
	 @Column(name="TiempoResolucion")
	private int tiempoMaximoResolucion;
	





	
	
	
	
}


