package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteResponsibleDependency;
import Proyecto.ProyectoDeAula.domain.dto.ResponsibleDependencyDTO;
import Proyecto.ProyectoDeAula.domain.service.ResponsibleDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteResponsibleDependency.API)
public class ResponsibleDependencyController {
    @Autowired
    private ResponsibleDependencyService responsibleDependencyService;

    @PostMapping(value = RouteResponsibleDependency.SAVE_TIPO_RESPONSABLE_DEPENDENCIA)
    public ResponsibleDependencyDTO save(@RequestBody ResponsibleDependencyDTO responsibleDependencyDTO){
        return responsibleDependencyService.save(responsibleDependencyDTO);
    }

    @GetMapping(value = RouteResponsibleDependency.SAVE_TIPO_RESPONSABLE_DEPENDENCIA)
    public List<ResponsibleDependencyDTO> get(){return responsibleDependencyService.getAll();}
}
