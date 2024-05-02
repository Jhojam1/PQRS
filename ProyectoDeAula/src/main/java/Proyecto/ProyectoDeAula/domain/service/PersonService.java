package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.PersonDTO;
import Proyecto.ProyectoDeAula.domain.mapper.PersonMapper;
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
        personRepository.save(PersonMapper.toEntity(personDTO));
        return personDTO;
    }

    public List<PersonDTO> getAll() {
        return personRepository.findAll().stream().map(PersonMapper::toDTO).collect(Collectors.toList());
    }
}
