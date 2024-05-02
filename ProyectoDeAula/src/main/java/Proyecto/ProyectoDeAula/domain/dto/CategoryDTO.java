package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Dependence;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryDTO {
    private int idCategory;
    private String nameCategory;
    private Dependence dependence;

}
