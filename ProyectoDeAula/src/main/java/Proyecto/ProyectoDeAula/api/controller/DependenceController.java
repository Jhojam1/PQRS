package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteDependence;
import Proyecto.ProyectoDeAula.domain.dto.DependenceDTO;
import Proyecto.ProyectoDeAula.domain.service.DependenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteDependence.API)
public class DependenceController {
    @Autowired
    private DependenceService dependenceService;

    @PostMapping(value = RouteDependence.SAVE_DEPENDENCIA)
    public DependenceDTO save(@RequestBody DependenceDTO dependenceDTO){
        return dependenceService.save(dependenceDTO);
    }

    @GetMapping(value = RouteDependence.SAVE_DEPENDENCIA)
    public List<DependenceDTO> get(){return dependenceService.getAll();}
}
