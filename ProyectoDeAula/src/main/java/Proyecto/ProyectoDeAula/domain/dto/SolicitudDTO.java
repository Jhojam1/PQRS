package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Categoria;
import Proyecto.ProyectoDeAula.persistence.entity.EstadoSolicitud;
import Proyecto.ProyectoDeAula.persistence.entity.TipoSolicitud;
import Proyecto.ProyectoDeAula.persistence.entity.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class SolicitudDTO {
    private int idSolicitud;
    private Usuario usuario;
    private TipoSolicitud tipoSolicitud;
    private Categoria categoria;
    private String descripcion;
    private Date fecha;
    private String respuesta;
    private EstadoSolicitud estadoSolicitud;
    private String medioRespuesta;
}
