package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Dependence;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponsibleDependencyDTO {
    private String user;
    private Dependence dependence;
}
