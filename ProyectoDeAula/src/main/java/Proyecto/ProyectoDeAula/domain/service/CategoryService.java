package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.CategoryDTO;
import Proyecto.ProyectoDeAula.domain.mapper.CategoryMapper;
import Proyecto.ProyectoDeAula.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
@Autowired
    private CategoryRepository categoryRepository;

    public CategoryDTO save(CategoryDTO categoryDTO) {
        categoryRepository.save(CategoryMapper.toEntity(categoryDTO));
        return categoryDTO;
    }

    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll().stream().map(CategoryMapper::toDTO).collect(Collectors.toList());
    }
}
