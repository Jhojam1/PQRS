package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteCategoria;
import Proyecto.ProyectoDeAula.domain.dto.CategoriaDTO;
import Proyecto.ProyectoDeAula.domain.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteCategoria.API)
public class CategoriaController {
    @Autowired

    private CategoriaService categoriaService;

    @PostMapping(value = RouteCategoria.SAVE_CATEGORIA)
    public CategoriaDTO save(@RequestBody CategoriaDTO categoriaDTO){
        return categoriaService.save(categoriaDTO);
    }

    @GetMapping(value = RouteCategoria.SAVE_CATEGORIA)
    public List<CategoriaDTO> get(){return categoriaService.getAll();}
}
