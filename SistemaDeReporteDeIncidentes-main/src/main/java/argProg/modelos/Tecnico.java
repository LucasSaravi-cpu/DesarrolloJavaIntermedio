package argProg.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter @Setter
@Entity
@Table(name = "tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    @Column(name = "nombre", length = 50)
    private String nombre;


    @OneToMany(mappedBy = "tecnico",cascade = {CascadeType.PERSIST})//mapeado por el atributo tecnico en Especialidad
    private List<Especialidad> especialidades;


    @OneToMany
    private List<Incidente> incidentes;
    @Column(name = "tiempo_por_defecto")
    private Integer tiempopordefecto;


    public Tecnico() {
        this.incidentes = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public Tecnico(String nombre, Integer tiempopordefecto) {
        this.setNombre(nombre);
        this.setTiempopordefecto(tiempopordefecto);
        this.especialidades = new ArrayList<>();
        this.incidentes = new ArrayList<>();
    }

    public Tecnico(String nombre, List<Especialidad> especialidades, Integer tiempoPorDefecto) {
        this.setNombre(nombre);
        this.setTiempopordefecto(tiempoPorDefecto);
        this.setEspecialidades(especialidades);
        this.incidentes = new ArrayList<>();
    }


    public void agregarEspecialidad(Especialidad nuevaEspecialidad) {
        this.especialidades.add(nuevaEspecialidad);
    }

    public void agregarIncidente(Incidente nuevoIncidente){
        this.incidentes.add(nuevoIncidente);
    }

    @Override
    public String toString() {
        return String.format("id: %s,nombre: %s",this.getId(),this.getNombre());
    }
}