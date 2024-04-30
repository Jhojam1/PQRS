package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.ResponsableDependenciaDTO;
import Proyecto.ProyectoDeAula.persistence.entity.ResponsableDependencia;

public class ResponsableDependenciaMapper {

    public static ResponsableDependencia toEntity(ResponsableDependenciaDTO responsableDependenciaDTO) {
        ResponsableDependencia responsableDependencia = new ResponsableDependencia();
        responsableDependencia.setUsuario(responsableDependenciaDTO.getUsuario());
        responsableDependencia.setDependencia(responsableDependenciaDTO.getDependencia());
        return responsableDependencia;
    }

    public static ResponsableDependenciaDTO toDTO(ResponsableDependencia responsableDependencia) {
        ResponsableDependenciaDTO responsableDependenciaDTO = new ResponsableDependenciaDTO();
        responsableDependenciaDTO.setUsuario(responsableDependencia.getUsuario());
        responsableDependenciaDTO.setDependencia(responsableDependencia.getDependencia());
        return responsableDependenciaDTO;
    }
}
