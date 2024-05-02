package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.UserTypeDTO;
import Proyecto.ProyectoDeAula.domain.mapper.UserTypeMapper;
import Proyecto.ProyectoDeAula.persistence.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserTypeService {
@Autowired
    private UserTypeRepository userTypeRepository;


    public UserTypeDTO save(UserTypeDTO userTypeDTO) {
        userTypeRepository.save(UserTypeMapper.toEntinty(userTypeDTO));
        return userTypeDTO;
    }

    public List<UserTypeDTO> getAll() {
        return userTypeRepository.findAll().stream().map(UserTypeMapper::toDto).collect(Collectors.toList());
    }
}
