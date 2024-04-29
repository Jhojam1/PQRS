package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteUsuario;
import Proyecto.ProyectoDeAula.domain.dto.UsuarioDTO;
import Proyecto.ProyectoDeAula.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteUsuario.API)
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = RouteUsuario.SAVE_USUARIO)
    public UsuarioDTO save(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioService.save(usuarioDTO);
    }

    @GetMapping(value = RouteUsuario.SAVE_USUARIO)
    public List<UsuarioDTO> get(){return usuarioService.getAll();}
    }


