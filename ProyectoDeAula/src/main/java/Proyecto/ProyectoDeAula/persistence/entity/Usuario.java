package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Usuario {
    @Id
    private String Usuario;
    private String Password;
    @OneToOne
    private Persona persona;
    @ManyToOne
    private TipoUsuario tipoUsuario;
}
