package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Dependence;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    private Long idCategory;
    private String nameCategory;
    private Dependence dependence;

}
