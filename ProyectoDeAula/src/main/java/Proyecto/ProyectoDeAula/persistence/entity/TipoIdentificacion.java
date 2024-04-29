package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TipoIdentificacion {
    @Id
    private int idTipoIdentificacion;
    private String descripcion;
}