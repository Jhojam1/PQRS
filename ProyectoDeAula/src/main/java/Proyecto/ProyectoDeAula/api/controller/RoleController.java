package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.RoleDTO;
import Proyecto.ProyectoDeAula.domain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API + Route.Role.Role)
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping(value = Route.Role.SAVE_ROLE)
    public RoleDTO save(@RequestBody RoleDTO roleDTO) {
        return roleService.save(roleDTO);
    }

    @GetMapping(value = Route.Role.GET_ROLE)
    public List<RoleDTO> get() {
        return roleService.getAll();
    }
}
