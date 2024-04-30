package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.DependenciaDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Dependencia;

import java.util.Random;

public class DependenciaMapper {
    public static Dependencia toEntity(DependenciaDTO dependenciaDTO) {
        Dependencia dependencia = new Dependencia();
        dependencia.setIdDependencia(new Random().nextInt());
        dependencia.setNombreDependencia(dependenciaDTO.getDescripcion());
        return dependencia;
    }

    public static DependenciaDTO toDTO(Dependencia dependencia) {
        DependenciaDTO dependenciaDTO = new DependenciaDTO();
        dependenciaDTO.setIdDependencia(dependencia.getIdDependencia());
        dependenciaDTO.setDescripcion(dependencia.getNombreDependencia());
        return dependenciaDTO;
    }
}
