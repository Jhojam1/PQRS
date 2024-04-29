package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.UsuarioDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Usuario;

public class UsuarioMapper {

    public static Usuario toEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsuario(usuarioDTO.getUsuario());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setPersona(usuarioDTO.getPersona());
        usuario.setTipoUsuario(usuarioDTO.getTipoUsuario());
        return usuario;
    }
    public static UsuarioDTO toDto(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setUsuario(usuario.getUsuario());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setPersona(usuarioDTO.getPersona());
        usuarioDTO.setTipoUsuario(usuarioDTO.getTipoUsuario());
        return usuarioDTO;
    }
}
