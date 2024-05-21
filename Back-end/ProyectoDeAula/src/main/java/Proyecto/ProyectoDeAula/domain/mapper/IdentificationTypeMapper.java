package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.IdentificationTypeDTO;
import Proyecto.ProyectoDeAula.persistence.entity.IdentificationType;


public class IdentificationTypeMapper {

    public static IdentificationType toEntity(IdentificationTypeDTO identificationTypeDTO) {
        IdentificationType identificationType = new IdentificationType();
        identificationType.setIdIdentificationType(identificationType.getIdIdentificationType());
        identificationType.setNameIdentificationType(identificationTypeDTO.getNameIdentificationType());
        return identificationType;
    }
    public static IdentificationTypeDTO toDTO(IdentificationType identificationType) {
        IdentificationTypeDTO identificationTypeDTO = new IdentificationTypeDTO();
        identificationTypeDTO.setIdIdentificationType(identificationType.getIdIdentificationType());
        identificationTypeDTO.setNameIdentificationType(identificationType.getNameIdentificationType());
        return identificationTypeDTO;
    }
}
