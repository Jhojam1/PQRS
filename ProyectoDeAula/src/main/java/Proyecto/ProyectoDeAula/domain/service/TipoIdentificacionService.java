package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.TipoIdentificacionDTO;
import Proyecto.ProyectoDeAula.domain.mapper.TipoIdentificacionMapper;
import Proyecto.ProyectoDeAula.persistence.repository.TipoIdentificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoIdentificacionService {
    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;

    public TipoIdentificacionDTO save(TipoIdentificacionDTO tipoIdentificacionDTO) {
        tipoIdentificacionRepository.save(TipoIdentificacionMapper.toEntity(tipoIdentificacionDTO));
        return tipoIdentificacionDTO;
    }

    public List<TipoIdentificacionDTO> getAll() {
        return tipoIdentificacionRepository.findAll().stream().map(TipoIdentificacionMapper::toDTO).collect(Collectors.toList());
    }
}
