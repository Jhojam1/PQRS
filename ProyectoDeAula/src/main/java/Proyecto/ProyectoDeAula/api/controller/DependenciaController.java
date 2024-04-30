package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteDependencia;
import Proyecto.ProyectoDeAula.domain.dto.DependenciaDTO;
import Proyecto.ProyectoDeAula.domain.service.DependenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteDependencia.API)
public class DependenciaController {
    @Autowired
    private DependenciaService dependenciaService;

    @PostMapping(value = RouteDependencia.SAVE_DEPENDENCIA)
    public DependenciaDTO save(@RequestBody DependenciaDTO dependenciaDTO){
        return dependenciaService.save(dependenciaDTO);
    }

    @GetMapping(value = RouteDependencia.SAVE_DEPENDENCIA)
    public List<DependenciaDTO> get(){return dependenciaService.getAll();}
}
