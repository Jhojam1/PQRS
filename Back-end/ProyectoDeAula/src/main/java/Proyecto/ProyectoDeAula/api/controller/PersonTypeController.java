package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.PersonTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.PersonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = Route.API + Route.PersonType.PersonType)
public class PersonTypeController {
    @Autowired
    private PersonTypeService personTypeService;

    @PostMapping(value = Route.PersonType.SAVE_PERSON_TYPE)
    public PersonTypeDTO save(@RequestBody PersonTypeDTO personTypeDTO){
        return personTypeService.save(personTypeDTO);
    }

    @GetMapping(value = Route.PersonType.GET_PERSON_TYPE)
    public List<PersonTypeDTO> get(){return personTypeService.getAll();}

    @PutMapping(value = Route.PersonType.UPDATE_PERSON_TYPE)
    public ResponseEntity<?> update(@RequestBody PersonTypeDTO personTypeDTO) {
        Optional<PersonTypeDTO> personTypeDTOOptional = personTypeService.findById(personTypeDTO.getIdPersonType());
        if(personTypeDTOOptional.isPresent()) {
            personTypeService.save(personTypeDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}

