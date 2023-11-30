package argProg.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "tipo_problema")
public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "nombre",length = 50)
    private String nombre;
    @Column(name = "descripcion",length = 150 )
    private String descripcion;
    @Column(name = "tiempo_max_resolucion",length = 2 )
    private int tiempoMaximoDeResolucion;

    public TipoProblema(String nombre, String descripcion, int tiempoMaxDeResolucion) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setTiempoMaximoDeResolucion(tiempoMaxDeResolucion);
    }

    @Override
    public String toString() {
        return String.format("id: %s, nombre: %s",this.getId(),this.getNombre());
    }
}
