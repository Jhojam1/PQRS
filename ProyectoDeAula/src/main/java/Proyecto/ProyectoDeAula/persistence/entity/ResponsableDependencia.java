package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ResponsableDependencia {
    @Id
    private String Usuario;
    @ManyToOne
    private Dependencia dependencia;
}
