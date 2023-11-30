package argProg.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private int id;
    @Column(name = "nombre",length = 50)
    private String nombre;
    @Column(name = "descripcion",length=150)
    private String descripcion;
    @ManyToMany(mappedBy = "serviciosContratados",cascade = {CascadeType.PERSIST})//Con esto tendriamos que un Servicio puede tener muchos Clientes
    private List<Cliente> cliente;

    public Servicio(String nombre,String descripcion){
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
    }
    @Override
    public String toString(){
        return String.format("id: %s, nombre:%s",this.getId(),this.getNombre());
    }
}
