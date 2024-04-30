package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.TipoSolicitudDTO;
import Proyecto.ProyectoDeAula.domain.dto.TipoUsuarioDTO;
import Proyecto.ProyectoDeAula.persistence.entity.TipoSolicitud;
import Proyecto.ProyectoDeAula.persistence.entity.TipoUsuario;

import java.util.Random;

public class TipoSolicitudMapper
{
    public static TipoSolicitud toEntinty(TipoSolicitudDTO tipoSolicitudDTO){
        TipoSolicitud tipoSoli = new TipoSolicitud();
        tipoSoli.setIdTipoSolicitud(new Random().nextInt());
        tipoSoli.setDescripcion(tipoSolicitudDTO.getDescripcion());
        return tipoSoli;
    }

    public static TipoSolicitudDTO toDto(TipoSolicitud tipoSolicitud){
        TipoSolicitudDTO tipoSolicitudDTO = new TipoSolicitudDTO();
        tipoSolicitudDTO.setIdTipoSolicitud(tipoSolicitud.getIdTipoSolicitud());
        tipoSolicitudDTO.setDescripcion(tipoSolicitud.getDescripcion());
        return tipoSolicitudDTO;
    }
}
