package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.CategoryDTO;
import Proyecto.ProyectoDeAula.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
