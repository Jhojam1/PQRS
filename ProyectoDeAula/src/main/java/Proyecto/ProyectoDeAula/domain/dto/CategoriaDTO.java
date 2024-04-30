package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Dependencia;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoriaDTO {
    private int idCategoria;
    private String nombreCategoria;
    private Dependencia dependencia;

}
