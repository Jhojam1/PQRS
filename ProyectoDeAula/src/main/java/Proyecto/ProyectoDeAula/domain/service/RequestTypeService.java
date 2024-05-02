package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.RequestTypeDTO;
import Proyecto.ProyectoDeAula.domain.mapper.RequestTypeMapper;
import Proyecto.ProyectoDeAula.persistence.repository.RequestTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestTypeService {
    @Autowired
    private RequestTypeRepository requestTypeRepository;

    public RequestTypeDTO save(RequestTypeDTO requestTypeDTO) {
        requestTypeRepository.save(RequestTypeMapper.toEntinty(requestTypeDTO));
        return requestTypeDTO;
    }

    public List<RequestTypeDTO> getAll() {
        return requestTypeRepository.findAll().stream().map(RequestTypeMapper::toDto).collect(Collectors.toList());
    }
}
