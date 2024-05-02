package Proyecto.ProyectoDeAula.domain.service;

import Proyecto.ProyectoDeAula.domain.dto.IdentificationTypeDTO;
import Proyecto.ProyectoDeAula.domain.mapper.IdentificationTypeMapper;
import Proyecto.ProyectoDeAula.persistence.repository.IdentificationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IdentificationTypeService {
    @Autowired
    private IdentificationTypeRepository identificationTypeRepository;

    public IdentificationTypeDTO save(IdentificationTypeDTO identificationTypeDTO) {
        identificationTypeRepository.save(IdentificationTypeMapper.toEntity(identificationTypeDTO));
        return identificationTypeDTO;
    }

    public List<IdentificationTypeDTO> getAll() {
        return identificationTypeRepository.findAll().stream().map(IdentificationTypeMapper::toDTO).collect(Collectors.toList());
    }
}
