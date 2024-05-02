package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.UserTypeDTO;
import Proyecto.ProyectoDeAula.persistence.entity.UserType;

import java.util.Random;

public class UserTypeMapper
{
    public static UserType toEntinty(UserTypeDTO userTypeDTO){
        UserType tipoUser = new UserType();
        tipoUser.setIdUserType(userTypeDTO.getIdUserType());
        tipoUser.setNameUserType(userTypeDTO.getNameUserType());
        return tipoUser;
    }

    public static UserTypeDTO toDto(UserType userType){
        UserTypeDTO userTypeDTO = new UserTypeDTO();
        userTypeDTO.setIdUserType(userType.getIdUserType());
        userTypeDTO.setNameUserType(userType.getNameUserType());
        return userTypeDTO;
    }
}
