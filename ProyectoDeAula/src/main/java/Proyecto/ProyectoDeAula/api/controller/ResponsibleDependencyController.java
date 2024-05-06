package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.ResponsibleDependencyDTO;
import Proyecto.ProyectoDeAula.domain.service.ResponsibleDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API + Route.ResponsibleDependency.ResponsibleDependency)
public class ResponsibleDependencyController {
    @Autowired
    private ResponsibleDependencyService responsibleDependencyService;

    @PostMapping(value = Route.ResponsibleDependency.SAVE_TIPO_RESPONSABLE_DEPENDENCIA)
    public ResponsibleDependencyDTO save(@RequestBody ResponsibleDependencyDTO responsibleDependencyDTO){
        return responsibleDependencyService.save(responsibleDependencyDTO);
    }

    @GetMapping(value = Route.ResponsibleDependency.GET_TIPO_RESPONSABLE_DEPENDENCIA)
    public List<ResponsibleDependencyDTO> get(){return responsibleDependencyService.getAll();}
}
