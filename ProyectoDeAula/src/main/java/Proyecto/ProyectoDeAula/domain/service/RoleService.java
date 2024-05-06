package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.RoleDTO;
import Proyecto.ProyectoDeAula.domain.mapper.RoleMapper;
import Proyecto.ProyectoDeAula.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {
@Autowired
    private RoleRepository roleRepository;

public RoleDTO save(RoleDTO roleDTO) {
        roleRepository.save(RoleMapper.toEntity(roleDTO));
        return roleDTO;
    }
    public List<RoleDTO> getAll() {
        return roleRepository.findAll().stream().map(RoleMapper::toDTO).collect(Collectors.toList());
    }
}
