package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Persona;
import Proyecto.ProyectoDeAula.persistence.entity.TipoUsuario;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioDTO {
    private String usuario;
    private String password;
    private Persona Persona;
    private TipoUsuario TipoUsuario;
}
