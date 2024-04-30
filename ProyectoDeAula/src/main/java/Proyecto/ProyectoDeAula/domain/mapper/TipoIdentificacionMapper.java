package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.TipoIdentificacionDTO;
import Proyecto.ProyectoDeAula.persistence.entity.TipoIdentificacion;

import java.util.Random;

public class TipoIdentificacionMapper {

    public static TipoIdentificacion toEntity(TipoIdentificacionDTO tipoIdentificacionDTO) {
        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();
        tipoIdentificacion.setIdTipoIdentificacion(new Random().nextInt());
        tipoIdentificacion.setDescripcion(tipoIdentificacionDTO.getDescripcion());
        return tipoIdentificacion;
    }
    public static TipoIdentificacionDTO toDTO(TipoIdentificacion tipoIdentificacion) {
        TipoIdentificacionDTO tipoIdentificacionDTO = new TipoIdentificacionDTO();
        tipoIdentificacionDTO.setIdTipoIdentificacion(tipoIdentificacion.getIdTipoIdentificacion());
        tipoIdentificacionDTO.setDescripcion(tipoIdentificacion.getDescripcion());
        return tipoIdentificacionDTO;
    }
}
