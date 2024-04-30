package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.CategoriaDTO;
import Proyecto.ProyectoDeAula.domain.mapper.CategoriaMapper;
import Proyecto.ProyectoDeAula.persistence.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
@Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaDTO save(CategoriaDTO categoriaDTO) {
        categoriaRepository.save(CategoriaMapper.toEntity(categoriaDTO));
        return categoriaDTO;
    }

    public List<CategoriaDTO> getAll() {
        return categoriaRepository.findAll().stream().map(CategoriaMapper::toDTO).collect(Collectors.toList());
    }
}
