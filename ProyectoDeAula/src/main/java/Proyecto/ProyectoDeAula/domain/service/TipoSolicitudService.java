package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.TipoSolicitudDTO;
import Proyecto.ProyectoDeAula.domain.mapper.TipoSolicitudMapper;
import Proyecto.ProyectoDeAula.persistence.repository.TipoSolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoSolicitudService {
    @Autowired
    private TipoSolicitudRepository tipoSolicitudRepository;

    public TipoSolicitudDTO save(TipoSolicitudDTO tipoSolicitudDTO) {
        tipoSolicitudRepository.save(TipoSolicitudMapper.toEntinty(tipoSolicitudDTO));
        return tipoSolicitudDTO;
    }

    public List<TipoSolicitudDTO> getAll() {
        return tipoSolicitudRepository.findAll().stream().map(TipoSolicitudMapper::toDto).collect(Collectors.toList());
    }
}
