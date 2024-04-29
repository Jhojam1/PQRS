package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class EstadoSolicitud {
@Id
    private int IdEstadoSolicitud;
    private String descripcion;
}
