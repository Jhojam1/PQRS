package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.PersonaDTO;
import Proyecto.ProyectoDeAula.domain.mapper.PersonaMapper;
import Proyecto.ProyectoDeAula.persistence.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {
@Autowired
    private PersonaRepository personaRepository;

    public PersonaDTO save(PersonaDTO personaDTO) {
        personaRepository.save(PersonaMapper.toEntity(personaDTO));
        return personaDTO;
    }

    public List<PersonaDTO> getAll() {
        return personaRepository.findAll().stream().map(PersonaMapper::toDTO).collect(Collectors.toList());
    }
}
