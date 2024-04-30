package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.SolicitudDTO;
import Proyecto.ProyectoDeAula.domain.dto.TipoIdentificacionDTO;
import Proyecto.ProyectoDeAula.domain.mapper.SolicitudMapper;
import Proyecto.ProyectoDeAula.domain.mapper.TipoIdentificacionMapper;
import Proyecto.ProyectoDeAula.persistence.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SolicitudServices {
@Autowired
    private SolicitudRepository solicitudRepository;

public SolicitudDTO save(SolicitudDTO solicitudDTO) {
    solicitudRepository.save(SolicitudMapper.toEntity(solicitudDTO));
    return solicitudDTO;
}

public List<SolicitudDTO> getAll() {
    return solicitudRepository.findAll().stream().map(SolicitudMapper::toDTO).collect(Collectors.toList());
}
}
