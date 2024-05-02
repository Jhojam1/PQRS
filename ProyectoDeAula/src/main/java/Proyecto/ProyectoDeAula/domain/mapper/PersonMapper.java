package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.PersonDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Person;

import java.util.Random;

public class PersonMapper {

    public static Person toEntity(PersonDTO personDTO) {
        Person person = new Person();
        person.setIdPerson(personDTO.getIdPerson());
        person.setName(personDTO.getName());
        person.setLastName(personDTO.getLastName());
        person.setEmail(personDTO.getEmail());
        person.setIdentificationType(personDTO.getIdentificationType());
        person.setIdentificationNumber(personDTO.getIdentificationNumber());
        return person;
    }

    public static PersonDTO toDTO(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setIdPerson(person.getIdPerson());
        personDTO.setName(person.getName());
        personDTO.setLastName(person.getLastName());
        personDTO.setEmail(person.getEmail());
        personDTO.setIdentificationType(person.getIdentificationType());
        personDTO.setIdentificationNumber(person.getIdentificationNumber());
        return personDTO;
    }
}
