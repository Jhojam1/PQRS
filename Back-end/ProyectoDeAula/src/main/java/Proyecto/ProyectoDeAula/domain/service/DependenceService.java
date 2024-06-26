package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.DependenceDTO;
import Proyecto.ProyectoDeAula.domain.mapper.DependenceMapper;
import Proyecto.ProyectoDeAula.persistence.repository.DependenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DependenceService {
@Autowired
    private DependenceRepository dependenceRepository;

    public DependenceDTO save(DependenceDTO dependenceDTO) {
        dependenceRepository.save(DependenceMapper.toEntity(dependenceDTO));
        return dependenceDTO;
    }

    public List<DependenceDTO> getAll() {
        return dependenceRepository.findAll().stream().map(DependenceMapper::toDTO).collect(Collectors.toList());
    }
    public Optional<DependenceDTO> findById(Long id) {
        return dependenceRepository.findById(id).map(DependenceMapper::toDTO);
    }
}
