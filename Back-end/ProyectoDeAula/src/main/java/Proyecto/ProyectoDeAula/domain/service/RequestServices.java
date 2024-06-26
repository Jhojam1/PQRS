package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.RequestDTO;
import Proyecto.ProyectoDeAula.domain.mapper.RequestMapper;
import Proyecto.ProyectoDeAula.persistence.entity.Request;
import Proyecto.ProyectoDeAula.persistence.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RequestServices {
@Autowired
    private RequestRepository requestRepository;

public RequestDTO save(RequestDTO requestDTO) {
    Request request = requestRepository.save(RequestMapper.toEntity(requestDTO));
    requestDTO.setIdRequest(request.getIdRequest());
    return requestDTO;
}

public List<RequestDTO> getAll() {
    return requestRepository.findAll().stream().map(RequestMapper::toDTO).collect(Collectors.toList());
}
    public Optional<RequestDTO> findById(Long id) {
        return requestRepository.findById(id).map(RequestMapper::toDTO);
    }
}
