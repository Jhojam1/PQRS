package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteTipoUsuario;
import Proyecto.ProyectoDeAula.domain.dto.TipoUsuarioDTO;
import Proyecto.ProyectoDeAula.domain.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteTipoUsuario.API)
public class TipoUsuarioController {
    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @PostMapping(value = RouteTipoUsuario.SAVE_TIPOUSUARIO)
    public TipoUsuarioDTO save(@RequestBody TipoUsuarioDTO tipoUsuarioDTO){
        return tipoUsuarioService.save(tipoUsuarioDTO);
    }

    @GetMapping(value = RouteTipoUsuario.SAVE_TIPOUSUARIO)
    public List<TipoUsuarioDTO> get(){return tipoUsuarioService.getAll();}
}

