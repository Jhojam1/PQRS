package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Dependencia;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponsableDependenciaDTO {
    private String usuario;
    private Dependencia dependencia;
}
