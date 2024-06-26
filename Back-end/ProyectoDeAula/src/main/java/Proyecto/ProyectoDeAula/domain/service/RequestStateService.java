package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.RequestStateDTO;
import Proyecto.ProyectoDeAula.domain.mapper.RequestStateMapper;
import Proyecto.ProyectoDeAula.persistence.repository.RequestStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RequestStateService {
    @Autowired
    RequestStateRepository requestStateRepository;

    public RequestStateDTO save(RequestStateDTO requestStateDTO) {
        requestStateRepository.save(RequestStateMapper.toEntity(requestStateDTO));
        return requestStateDTO;
    }

    public List<RequestStateDTO> getAll() {
        return requestStateRepository.findAll().stream().map(RequestStateMapper::toDTO).collect(Collectors.toList());
    }

    public Optional<RequestStateDTO> findById(Long id) {
        return requestStateRepository.findById(id).map(RequestStateMapper::toDTO);
    }
}
