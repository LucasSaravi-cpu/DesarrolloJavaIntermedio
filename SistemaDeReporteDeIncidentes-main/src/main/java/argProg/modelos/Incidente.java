package argProg.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;

@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "incidentes")
@NamedQueries({
        @NamedQuery(name = "Incidente_buscarResueltos",query="SELECT inci FROM Incidente inci WHERE inci.estado =\"resuelto\"")
})
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "descripcion",length = 150)
    private String DescripcionIncidente;

    @ManyToOne(cascade = {CascadeType.PERSIST})//Muchos Incidentes se asocian a un(1) Tecnico
    @JoinColumn(name = "id_tecnico",referencedColumnName = "id")
    public Tecnico tecnico;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "id_cliente",referencedColumnName = "id")
    private Cliente cliente;


    /*private Servicio servicio;*/
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha_posible_resolucion")
    private LocalDate fechaPosibleResolucion;
    @Column(name = "fecha_finalizacion")
    private LocalDate fechaFinalizacion;
    @Column(name="complejo")
    private boolean complejo;

    //Un(uno) Incidente puede tener muchos TiposProblema --> @OneToMany
    @OneToMany(cascade ={CascadeType.PERSIST} )
    @JoinColumn(name = "id_incidente",referencedColumnName = "id")
    private List<TipoProblema> tiposdeproblema;

    public Incidente(String descripcionIncidente, Tecnico tecnico, Cliente cliente, String estado, LocalDate fechaPosibleResolucion, boolean complejo) {
        DescripcionIncidente = descripcionIncidente;
        this.tecnico = tecnico;
        this.cliente = cliente;
        this.estado = estado;
        this.fechaPosibleResolucion = fechaPosibleResolucion;
        this.complejo = complejo;
        this.tiposdeproblema = new ArrayList<>();
    }
    @Override
    public String toString(){
        String desc = String.format("id: %s, id_cliente: %s,id_tecnico:%s, \ndesc: %s, fechaFinalizacion:%s, estado: %s",
                this.getId(),this.getCliente().getId(),this.getTecnico().getId(),this.getDescripcionIncidente(),
                this.getFechaFinalizacion(),this.getEstado());
        return desc;
    }
}
