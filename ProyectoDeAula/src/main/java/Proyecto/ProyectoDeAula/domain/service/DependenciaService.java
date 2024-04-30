package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.DependenciaDTO;
import Proyecto.ProyectoDeAula.domain.mapper.DependenciaMapper;
import Proyecto.ProyectoDeAula.persistence.repository.DependenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DependenciaService {
@Autowired
    private DependenciaRepository dependenciaRepository;

    public DependenciaDTO save(DependenciaDTO dependenciaDTO) {
        dependenciaRepository.save(DependenciaMapper.toEntity(dependenciaDTO));
        return dependenciaDTO;
    }

    public List<DependenciaDTO> getAll() {
        return dependenciaRepository.findAll().stream().map(DependenciaMapper::toDTO).collect(Collectors.toList());
    }
}
