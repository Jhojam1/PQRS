package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteCategory;
import Proyecto.ProyectoDeAula.domain.dto.CategoryDTO;
import Proyecto.ProyectoDeAula.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteCategory.API)
public class CategoryController {
    @Autowired

    private CategoryService categoryService;

    @PostMapping(value = RouteCategory.SAVE_CATEGORIA)
    public CategoryDTO save(@RequestBody CategoryDTO categoryDTO){
        return categoryService.save(categoryDTO);
    }

    @GetMapping(value = RouteCategory.SAVE_CATEGORIA)
    public List<CategoryDTO> get(){return categoryService.getAll();}
}
