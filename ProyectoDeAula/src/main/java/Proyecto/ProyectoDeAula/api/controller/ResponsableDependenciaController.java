package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteResponsableDependencia;
import Proyecto.ProyectoDeAula.domain.dto.ResponsableDependenciaDTO;
import Proyecto.ProyectoDeAula.domain.service.ResponsableDependenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteResponsableDependencia.API)
public class ResponsableDependenciaController {
    @Autowired
    private ResponsableDependenciaService responsableDependenciaService;

    @PostMapping(value = RouteResponsableDependencia.SAVE_TIPO_RESPONSABLE_DEPENDENCIA)
    public ResponsableDependenciaDTO save(@RequestBody ResponsableDependenciaDTO responsableDependenciaDTO){
        return responsableDependenciaService.save(responsableDependenciaDTO);
    }

    @GetMapping(value = RouteResponsableDependencia.SAVE_TIPO_RESPONSABLE_DEPENDENCIA)
    public List<ResponsableDependenciaDTO> get(){return responsableDependenciaService.getAll();}
}
