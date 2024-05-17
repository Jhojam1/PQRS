package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.PersonTypeDTO;
import Proyecto.ProyectoDeAula.domain.dto.RequestDTO;
import Proyecto.ProyectoDeAula.domain.mapper.PersonTypeMapper;
import Proyecto.ProyectoDeAula.domain.mapper.RequestMapper;
import Proyecto.ProyectoDeAula.persistence.repository.PersonTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonTypeService {
@Autowired
    private PersonTypeRepository personTypeRepository;


    public PersonTypeDTO save(PersonTypeDTO personTypeDTO) {
        personTypeRepository.save(PersonTypeMapper.toEntinty(personTypeDTO));
        return personTypeDTO;
    }

    public List<PersonTypeDTO> getAll() {
        return personTypeRepository.findAll().stream().map(PersonTypeMapper::toDto).collect(Collectors.toList());
    }
    public Optional<PersonTypeDTO> findById(Long id) {
        return personTypeRepository.findById(id).map(PersonTypeMapper::toDto);
    }
}
