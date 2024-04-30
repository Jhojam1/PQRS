package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.EstadoSolicitudDTO;
import Proyecto.ProyectoDeAula.persistence.entity.EstadoSolicitud;

import java.util.Random;

public class EstadoSolicitudMapper {
    public static EstadoSolicitud toEntity(EstadoSolicitudDTO estadoSolicitudDTO) {
        EstadoSolicitud estadoSolicitud = new EstadoSolicitud();
        estadoSolicitud.setIdEstadoSolicitud(new Random().nextInt());
        estadoSolicitud.setDescripcion(estadoSolicitudDTO.getDescripcion());
        return estadoSolicitud;
    }

    public static EstadoSolicitudDTO toDTO(EstadoSolicitud estadoSolicitud) {
        EstadoSolicitudDTO estadoSolicitudDTO = new EstadoSolicitudDTO();
        estadoSolicitudDTO.setIdEstadoSolicitud(estadoSolicitud.getIdEstadoSolicitud());
        estadoSolicitudDTO.setDescripcion(estadoSolicitud.getDescripcion());
        return estadoSolicitudDTO;
    }
}
