package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.CategoryDTO;
import Proyecto.ProyectoDeAula.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = Route.API + Route.Category.Category)
public class CategoryController {
    @Autowired

    private CategoryService categoryService;

    @PostMapping(value = Route.Category.SAVE_CATEGORY)
    public CategoryDTO save(@RequestBody CategoryDTO categoryDTO){
        return categoryService.save(categoryDTO);
    }

    @GetMapping(value = Route.Category.GET_CATEGORY)
    public List<CategoryDTO> get(){return categoryService.getAll();}

    @PutMapping(value = Route.Category.UPDATE_CATEGORY)
    public ResponseEntity<?> update(@RequestBody CategoryDTO categoryDTO) {
        Optional<CategoryDTO> categoryDTOOptional = categoryService.findById(categoryDTO.getIdCategory());
        if(categoryDTOOptional.isPresent()) {
            categoryService.save(categoryDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
