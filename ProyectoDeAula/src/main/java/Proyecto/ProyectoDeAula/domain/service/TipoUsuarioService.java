package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.TipoUsuarioDTO;
import Proyecto.ProyectoDeAula.domain.dto.UsuarioDTO;
import Proyecto.ProyectoDeAula.domain.mapper.TipoUsuarioMapper;
import Proyecto.ProyectoDeAula.domain.mapper.UsuarioMapper;
import Proyecto.ProyectoDeAula.persistence.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoUsuarioService {
@Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;


    public TipoUsuarioDTO save(TipoUsuarioDTO tipoUsuarioDTO) {
        tipoUsuarioRepository.save(TipoUsuarioMapper.toEntinty(tipoUsuarioDTO));
        return tipoUsuarioDTO;
    }

    public List<TipoUsuarioDTO> getAll() {
        return tipoUsuarioRepository.findAll().stream().map(TipoUsuarioMapper::toDto).collect(Collectors.toList());
    }
}
