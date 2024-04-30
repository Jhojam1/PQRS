package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.TipoIdentificacion;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonaDTO {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private TipoIdentificacion tipoIdentificacion;
    private int numeroIdentificacion;
}
