package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.ResponsibleDependencyDTO;
import Proyecto.ProyectoDeAula.persistence.entity.ResponsibleDependency;

public class ResponsibleDependencyMapper {

    public static ResponsibleDependency toEntity(ResponsibleDependencyDTO responsibleDependencyDTO) {
        ResponsibleDependency responsibleDependency = new ResponsibleDependency();
        responsibleDependency.setUser(responsibleDependencyDTO.getUser());
        responsibleDependency.setDependence(responsibleDependencyDTO.getDependence());
        return responsibleDependency;
    }

    public static ResponsibleDependencyDTO toDTO(ResponsibleDependency responsibleDependency) {
        ResponsibleDependencyDTO responsibleDependencyDTO = new ResponsibleDependencyDTO();
        responsibleDependencyDTO.setUser(responsibleDependency.getUser());
        responsibleDependencyDTO.setDependence(responsibleDependency.getDependence());
        return responsibleDependencyDTO;
    }
}
