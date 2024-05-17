package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.ResponsibleDependencyDTO;
import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.domain.mapper.ResponsibleDependencyMapper;
import Proyecto.ProyectoDeAula.domain.mapper.UserMapper;
import Proyecto.ProyectoDeAula.persistence.repository.ResponsibleDependencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ResponsibleDependencyService {
@Autowired
ResponsibleDependencyRepository responsibleDependencyRepository;

    public ResponsibleDependencyDTO save(ResponsibleDependencyDTO responsibleDependencyDTO) {
        responsibleDependencyRepository.save(ResponsibleDependencyMapper.toEntity(responsibleDependencyDTO));
        return responsibleDependencyDTO;
    }

    public List<ResponsibleDependencyDTO> getAll() {
        return responsibleDependencyRepository.findAll().stream().map(ResponsibleDependencyMapper::toDTO).collect(Collectors.toList());
    }

    public Optional<ResponsibleDependencyDTO> findById(String id) {
        return responsibleDependencyRepository.findById(Long.valueOf(id)).map(ResponsibleDependencyMapper::toDTO);
    }
}
