package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = Route.API + Route.User.User)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = Route.User.SAVE_USUARIO)
    public UserDTO save(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @GetMapping(value = Route.User.GET_USUARIO)
    public List<UserDTO> get() {
        return userService.getAll();
    }

    @PostMapping(value = Route.User.LOGIN)
    public ResponseEntity<?> findUserAndPassword(@RequestBody UserDTO userDTO) {
        Optional<UserDTO> userDTOOptional;
        userDTOOptional = userService.findByIdAndPassword(userDTO.getUser(), userDTO.getPassword());
        if (userDTOOptional.isPresent()) {
            return ResponseEntity.ok(userDTOOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping(value = Route.User.UPDATE_USUARIO)
    public ResponseEntity<?> update(@RequestBody UserDTO userDTO) {
        Optional<UserDTO> userOptional = userService.findById(userDTO.getUser());
        if(userOptional.isPresent()) {
            userService.save(userDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}