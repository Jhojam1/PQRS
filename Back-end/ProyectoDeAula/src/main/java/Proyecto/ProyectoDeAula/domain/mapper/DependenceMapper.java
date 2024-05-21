package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.DependenceDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Dependence;


public class DependenceMapper {
    public static Dependence toEntity(DependenceDTO dependenceDTO) {
        Dependence dependence = new Dependence();
        dependence.setIdDependence(dependenceDTO.getIdDependence());
        dependence.setNameDependence(dependenceDTO.getNameDependence());
        return dependence;
    }

    public static DependenceDTO toDTO(Dependence dependence) {
        DependenceDTO dependenceDTO = new DependenceDTO();
        dependenceDTO.setIdDependence(dependence.getIdDependence());
        dependenceDTO.setNameDependence(dependence.getNameDependence());
        return dependenceDTO;
    }
}
