package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.UsuarioDTO;
import Proyecto.ProyectoDeAula.domain.mapper.UsuarioMapper;
import Proyecto.ProyectoDeAula.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        usuarioRepository.save(UsuarioMapper.toEntity(usuarioDTO));
        return usuarioDTO;
    }
    public List<UsuarioDTO> getAll() {
        return usuarioRepository.findAll().stream().map(UsuarioMapper::toDto).collect(Collectors.toList());
    }
}
