package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RoutePerson;
import Proyecto.ProyectoDeAula.domain.dto.PersonDTO;
import Proyecto.ProyectoDeAula.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RoutePerson.API)
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = RoutePerson.SAVE_PERSONA)
    public PersonDTO save(@RequestBody PersonDTO personDTO){
        return personService.save(personDTO);
    }

    @GetMapping(value = RoutePerson.SAVE_PERSONA)
    public List<PersonDTO> get(){return personService.getAll();}
}
