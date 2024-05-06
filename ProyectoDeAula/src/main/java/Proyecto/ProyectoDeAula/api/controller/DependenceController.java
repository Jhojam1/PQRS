package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.DependenceDTO;
import Proyecto.ProyectoDeAula.domain.service.DependenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API + Route.Dependence.Dependence)
public class DependenceController {
    @Autowired
    private DependenceService dependenceService;

    @PostMapping(value = Route.Dependence.SAVE_DEPENDENCE)
    public DependenceDTO save(@RequestBody DependenceDTO dependenceDTO){
        return dependenceService.save(dependenceDTO);
    }

    @GetMapping(value = Route.Dependence.GET_DEPENDENCE)
    public List<DependenceDTO> get(){return dependenceService.getAll();}
}
