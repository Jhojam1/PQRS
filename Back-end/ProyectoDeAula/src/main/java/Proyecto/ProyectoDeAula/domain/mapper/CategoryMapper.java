package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.CategoryDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Category;

public class CategoryMapper {
    public static Category toEntity(CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setIdCategory(categoryDTO.getIdCategory());
        category.setNameCategory(categoryDTO.getNameCategory());
        category.setDependence(categoryDTO.getDependence());
        return category;
    }

    public static CategoryDTO toDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setIdCategory(category.getIdCategory());
        categoryDTO.setNameCategory(category.getNameCategory());
        categoryDTO.setDependence(category.getDependence());
        return categoryDTO;
    }
}
