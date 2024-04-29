package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.TipoUsuarioDTO;
import Proyecto.ProyectoDeAula.persistence.entity.TipoUsuario;

import java.util.Random;

public class TipoUsuarioMapper
{
    public static TipoUsuario toEntinty(TipoUsuarioDTO tipoUsuarioDTO){
        TipoUsuario tipoUser = new TipoUsuario();
        tipoUser.setIdTipoUsuario(new Random().nextInt());
        tipoUser.setDescripcion(tipoUsuarioDTO.getDescripcion());
        return tipoUser;
    }

    public static TipoUsuarioDTO toDto(TipoUsuario tipoUsuario){
        TipoUsuarioDTO tipoUsuarioDTO = new TipoUsuarioDTO();
        tipoUsuarioDTO.setIdtipousuario(tipoUsuario.getIdTipoUsuario());
        tipoUsuarioDTO.setDescripcion(tipoUsuario.getDescripcion());
        return tipoUsuarioDTO;
    }
}
