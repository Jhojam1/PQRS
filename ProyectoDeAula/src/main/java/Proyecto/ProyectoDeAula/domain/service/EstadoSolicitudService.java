package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.EstadoSolicitudDTO;
import Proyecto.ProyectoDeAula.domain.mapper.EstadoSolicitudMapper;
import Proyecto.ProyectoDeAula.persistence.repository.EstadoSolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoSolicitudService {
    @Autowired
    EstadoSolicitudRepository estadoSolicitudRepository;

    public EstadoSolicitudDTO save(EstadoSolicitudDTO estadoSolicitudDTO) {
        estadoSolicitudRepository.save(EstadoSolicitudMapper.toEntity(estadoSolicitudDTO));
        return estadoSolicitudDTO;
    }

    public List<EstadoSolicitudDTO> getAll() {
        return estadoSolicitudRepository.findAll().stream().map(EstadoSolicitudMapper::toDTO).collect(Collectors.toList());
    }
}
