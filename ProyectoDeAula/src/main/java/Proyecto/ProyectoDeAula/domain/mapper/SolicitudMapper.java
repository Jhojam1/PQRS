package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.SolicitudDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Solicitud;

import java.util.Random;

public class SolicitudMapper {

    public static Solicitud toEntity(SolicitudDTO solicitudDTO) {
        Solicitud solicitud = new Solicitud();
        solicitud.setIdSolicitud(new Random().nextInt());
        solicitud.setUsuario(solicitudDTO.getUsuario());
        solicitud.setTipoSolicitud(solicitudDTO.getTipoSolicitud());
        solicitud.setCategoria(solicitudDTO.getCategoria());
        solicitud.setDescripcion(solicitudDTO.getDescripcion());
        solicitud.setFecha(solicitudDTO.getFecha());
        solicitud.setRespuesta(solicitudDTO.getRespuesta());
        solicitud.setEstadoSolicitud(solicitudDTO.getEstadoSolicitud());
        solicitud.setMedioRespuesta(solicitudDTO.getMedioRespuesta());
        return solicitud;
    }
    public static SolicitudDTO toDTO(Solicitud solicitud) {
        SolicitudDTO solicitudDTO = new SolicitudDTO();
        solicitudDTO.setIdSolicitud(solicitud.getIdSolicitud());
        solicitudDTO.setUsuario(solicitud.getUsuario());
        solicitudDTO.setTipoSolicitud(solicitud.getTipoSolicitud());
        solicitudDTO.setCategoria(solicitud.getCategoria());
        solicitudDTO.setDescripcion(solicitud.getDescripcion());
        solicitudDTO.setFecha(solicitud.getFecha());
        solicitudDTO.setRespuesta(solicitud.getRespuesta());
        solicitudDTO.setEstadoSolicitud(solicitud.getEstadoSolicitud());
        solicitudDTO.setMedioRespuesta(solicitud.getMedioRespuesta());
        return solicitudDTO;
    }
}
