package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TipoUsuario {
@Id
    private int idTipoUsuario;
    private String descripcion;
}
