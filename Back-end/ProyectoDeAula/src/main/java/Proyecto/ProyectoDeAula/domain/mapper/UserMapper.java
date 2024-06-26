package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.persistence.entity.User;

public class UserMapper {

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setUser(userDTO.getUser());
        user.setPassword(userDTO.getPassword());
        user.setPerson(userDTO.getPerson());
        user.setRole(userDTO.getRole());
        user.setStateUser(userDTO.getStateUser());
        return user;
    }

    public static UserDTO toDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUser(user.getUser());
        userDTO.setPassword(user.getPassword());
        userDTO.setPerson(user.getPerson());
        userDTO.setRole(user.getRole());
        userDTO.setStateUser(user.getStateUser());
        return userDTO;
    }

}
