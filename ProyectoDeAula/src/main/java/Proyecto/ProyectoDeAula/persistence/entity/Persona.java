package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona {
    @Id
    private int idPersona;
    private String nombre;
    private String apellido;
    private String correo;
    @ManyToOne
    private TipoIdentificacion tipoIdentificacion;
    private int numeroIdentificacion;
}
