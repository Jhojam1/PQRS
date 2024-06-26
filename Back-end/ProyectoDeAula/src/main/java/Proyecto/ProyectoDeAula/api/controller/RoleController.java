package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.RoleDTO;
import Proyecto.ProyectoDeAula.domain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping(value = Route.Role.UPDATE_ROLE)
    public ResponseEntity<?> update(@RequestBody RoleDTO roleDTO) {
        Optional<RoleDTO> roleDTOOptional = roleService.findById(roleDTO.getId());
        if(roleDTOOptional.isPresent()) {
            roleService.save(roleDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
