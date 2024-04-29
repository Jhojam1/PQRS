package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Setter
@Getter
public class Solicitud {
    @Id
    private int idSolicitud;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private TipoSolicitud tipoSolicitud;
    @ManyToOne
    private Categoria categoria;
    private String descripcion;
    private Date fecha;
    private String respuesta;
    @ManyToOne
    private EstadoSolicitud estadoSolicitud;
    private String medioRespuesta;
}
