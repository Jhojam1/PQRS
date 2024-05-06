package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.domain.mapper.UserMapper;
import Proyecto.ProyectoDeAula.persistence.entity.User;
import Proyecto.ProyectoDeAula.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO save(UserDTO userDTO) {
        userRepository.save(UserMapper.toEntity(userDTO));
        return userDTO;
    }
    public List<UserDTO> getAll() {
        return userRepository.findAll().stream().map(UserMapper::toDto).collect(Collectors.toList());
    }

    public Optional<UserDTO> findByIdAndPassword(String usuario, String password) {
        User user = userRepository.findByUserAndPassword(usuario, password);
        if (user != null) {
            return Optional.of(UserMapper.toDto(user));
        } else {
            return Optional.empty();
        }
    }



}
