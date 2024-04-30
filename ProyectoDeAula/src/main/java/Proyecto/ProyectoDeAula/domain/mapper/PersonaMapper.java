package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.PersonaDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Persona;

import java.util.Random;

public class PersonaMapper {

    public static Persona toEntity(PersonaDTO personaDTO) {
        Persona persona = new Persona();
        persona.setIdPersona(new Random().nextInt());
        persona.setNombre(personaDTO.getNombre());
        persona.setApellido(personaDTO.getApellido());
        persona.setCorreo(personaDTO.getEmail());
        persona.setTipoIdentificacion(personaDTO.getTipoIdentificacion());
        persona.setNumeroIdentificacion(personaDTO.getNumeroIdentificacion());
        return persona;
    }

    public static PersonaDTO toDTO(Persona persona) {
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setIdPersona(persona.getIdPersona());
        personaDTO.setNombre(persona.getNombre());
        personaDTO.setApellido(persona.getApellido());
        personaDTO.setEmail(persona.getCorreo());
        personaDTO.setTipoIdentificacion(persona.getTipoIdentificacion());
        personaDTO.setNumeroIdentificacion(persona.getNumeroIdentificacion());
        return personaDTO;
    }
}
