package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.UserTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API + Route.UserType.UserType)
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @PostMapping(value = Route.UserType.SAVE_TIPO_USUARIO)
    public UserTypeDTO save(@RequestBody UserTypeDTO userTypeDTO){
        return userTypeService.save(userTypeDTO);
    }

    @GetMapping(value = Route.UserType.GET_TIPO_USUARIO)
    public List<UserTypeDTO> get(){return userTypeService.getAll();}

}

