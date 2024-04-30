package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RoutePersona;
import Proyecto.ProyectoDeAula.domain.dto.PersonaDTO;
import Proyecto.ProyectoDeAula.domain.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RoutePersona.API)
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping(value = RoutePersona.SAVE_PERSONA)
    public PersonaDTO save(@RequestBody PersonaDTO personaDTO){
        return personaService.save(personaDTO);
    }

    @GetMapping(value = RoutePersona.SAVE_PERSONA)
    public List<PersonaDTO> get(){return personaService.getAll();}
}
