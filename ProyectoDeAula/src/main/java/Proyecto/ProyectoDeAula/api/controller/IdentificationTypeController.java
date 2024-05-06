package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.IdentificationTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.IdentificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API + Route.IdentificationType.IdentificationType)
public class IdentificationTypeController {
    @Autowired
    private IdentificationTypeService identificationTypeService;

    @PostMapping(value = Route.IdentificationType.SAVE_IDENTIFICATION_TYPE)
    public IdentificationTypeDTO save(@RequestBody IdentificationTypeDTO identificationTypeDTO){
        return identificationTypeService.save(identificationTypeDTO);
    }

    @GetMapping(value = Route.IdentificationType.GET_IDENTIFICATION_TYPE)
    public List<IdentificationTypeDTO> get(){return identificationTypeService.getAll();}
}

