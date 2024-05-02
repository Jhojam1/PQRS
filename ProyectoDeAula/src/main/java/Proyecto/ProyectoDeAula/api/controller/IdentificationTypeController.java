package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteIdentificationType;
import Proyecto.ProyectoDeAula.domain.dto.IdentificationTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.IdentificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteIdentificationType.API)
public class IdentificationTypeController {
    @Autowired
    private IdentificationTypeService identificationTypeService;

    @PostMapping(value = RouteIdentificationType.SAVE_TIPO_IDENTIFICACION)
    public IdentificationTypeDTO save(@RequestBody IdentificationTypeDTO identificationTypeDTO){
        return identificationTypeService.save(identificationTypeDTO);
    }

    @GetMapping(value = RouteIdentificationType.SAVE_TIPO_IDENTIFICACION)
    public List<IdentificationTypeDTO> get(){return identificationTypeService.getAll();}
}

