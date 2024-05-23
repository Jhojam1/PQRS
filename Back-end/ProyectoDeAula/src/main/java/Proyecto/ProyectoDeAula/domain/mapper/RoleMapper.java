package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.RoleDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Role;


public class RoleMapper {

    public static Role toEntity(RoleDTO roleDTO) {
        Role role = new Role();
        role.setId(roleDTO.getId());
        role.setNameRole(roleDTO.getNameRole());
        return role;
    }

    public static RoleDTO toDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId());
        roleDTO.setNameRole(role.getNameRole());
        return roleDTO;
    }
    }
