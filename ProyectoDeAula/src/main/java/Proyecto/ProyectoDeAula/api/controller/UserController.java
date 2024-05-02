package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteUser;
import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteUser.API)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = RouteUser.SAVE_USUARIO)
    public UserDTO save(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }

    @GetMapping(value = RouteUser.SAVE_USUARIO)
    public List<UserDTO> get(){return userService.getAll();}
    }


