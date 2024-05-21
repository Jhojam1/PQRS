package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.IdentificationTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.IdentificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping(value = Route.IdentificationType.UPDATE_IDENTIFICATION_TYPE)
    public ResponseEntity<?> update(@RequestBody IdentificationTypeDTO identificationTypeDTO) {
        Optional<IdentificationTypeDTO> identificationTypeDTOOptional = identificationTypeService.findById(identificationTypeDTO.getIdIdentificationType());
        if(identificationTypeDTOOptional.isPresent()) {
            identificationTypeService.save(identificationTypeDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}

