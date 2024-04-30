package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.ResponsableDependenciaDTO;
import Proyecto.ProyectoDeAula.domain.mapper.ResponsableDependenciaMapper;
import Proyecto.ProyectoDeAula.persistence.repository.ResponsableDependenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResponsableDependenciaService {
@Autowired
ResponsableDependenciaRepository responsableDependenciaRepository;

    public ResponsableDependenciaDTO save(ResponsableDependenciaDTO responsableDependenciaDTO) {
        responsableDependenciaRepository.save(ResponsableDependenciaMapper.toEntity(responsableDependenciaDTO));
        return responsableDependenciaDTO;
    }

    public List<ResponsableDependenciaDTO> getAll() {
        return responsableDependenciaRepository.findAll().stream().map(ResponsableDependenciaMapper::toDTO).collect(Collectors.toList());
    }
}
