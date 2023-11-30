package argProg.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private int id;
    @Column(name = "nombre",length = 80)
    private String nombre;
    @Column(name = "descripcion",length = 150)
    private String descripcion;
    //Una Especialidad puede tener 1 o mas Tecnicos, @ManyToOne
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="id_tecnico", referencedColumnName="id")
    private Tecnico tecnico;

    public Especialidad(String nombre, String descripcion) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
    }

    @Override
    public String toString() {
        return String.format("id: %s, nombre: %s, desc: %s",this.getId(),this.getNombre(),this.getDescripcion());
    }
}
