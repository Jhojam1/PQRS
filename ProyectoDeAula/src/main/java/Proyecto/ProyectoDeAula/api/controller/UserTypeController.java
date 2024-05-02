package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteUserType;
import Proyecto.ProyectoDeAula.domain.dto.UserTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteUserType.API)
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @PostMapping(value = RouteUserType.SAVE_TIPOUSUARIO)
    public UserTypeDTO save(@RequestBody UserTypeDTO userTypeDTO){
        return userTypeService.save(userTypeDTO);
    }

    @GetMapping(value = RouteUserType.GET_TIPOUSUARIO)
    public List<UserTypeDTO> get(){return userTypeService.getAll();}
}

