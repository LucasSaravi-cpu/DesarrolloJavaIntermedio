package model;
import java.util.ArrayList;
import java.util.Date;

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

@Table(name="INCIDENTES")


public class Incidente {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   //generará automáticamente un valor único para la clave principal
	 @Column(name="id")
	 private Long id;
	 
	 @Column(name="DescripcionIncidente") 
	private String DescripcionIncidente;
	
    private Cliente cliente;
    private Servicio servicio;
    
    
    @Column(name="Estado")
    private String estado;
    private Date fechaPosibleResolucion;
    private Date fechaFinalizacion;
    private boolean complejo;
	private ArrayList<TipoProblema> tiposdeproblema;
    
 

	
    



}
