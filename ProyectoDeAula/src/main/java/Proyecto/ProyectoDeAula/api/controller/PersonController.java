package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.PersonDTO;
import Proyecto.ProyectoDeAula.domain.dto.PersonTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = Route.API + Route.Person.Person)
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = Route.Person.SAVE_PERSON)
    public PersonDTO save(@RequestBody PersonDTO personDTO){

        return personService.save(personDTO);
    }

    @GetMapping(value = Route.Person.GET_PERSON)
    public List<PersonDTO> get(){return personService.getAll();}


    @PutMapping(value = Route.Person.UPDATE_PERSON)
    public ResponseEntity<?> update(@RequestBody PersonDTO personDTO) {
        Optional<PersonDTO> personDTOOptional = personService.findById(personDTO.getIdPerson());
        if(personDTOOptional.isPresent()) {
            personService.save(personDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
