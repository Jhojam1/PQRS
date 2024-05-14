package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.PersonDTO;
import Proyecto.ProyectoDeAula.domain.mapper.PersonMapper;
import Proyecto.ProyectoDeAula.persistence.entity.Person;
import Proyecto.ProyectoDeAula.persistence.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
@Autowired
    private PersonRepository personRepository;

    public PersonDTO save(PersonDTO personDTO) {
        // Convertir PersonDTO a entidad Person y guardar en la base de datos
        Person person = personRepository.save(PersonMapper.toEntity(personDTO));

        // Asignar el ID generado al objeto PersonDTO
        personDTO.setIdPerson(person.getIdPerson());

        // Devolver el objeto PersonDTO actualizado con el ID generado
        return personDTO;
    }

    public List<PersonDTO> getAll() {
        return personRepository.findAll().stream().map(PersonMapper::toDTO).collect(Collectors.toList());
    }
}
