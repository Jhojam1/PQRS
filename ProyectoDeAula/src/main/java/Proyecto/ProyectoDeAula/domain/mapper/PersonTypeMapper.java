package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.PersonTypeDTO;
import Proyecto.ProyectoDeAula.persistence.entity.PersonType;

public class PersonTypeMapper
{
    public static PersonType toEntinty(PersonTypeDTO personTypeDTO){
        PersonType personType = new PersonType();
        personType.setIdPersonType(personTypeDTO.getIdPersonType());
        personType.setNamePersonType(personTypeDTO.getNamePersonType());
        return personType;
    }

    public static PersonTypeDTO toDto(PersonType personType) {
        PersonTypeDTO personTypeDTO = new PersonTypeDTO();
        personTypeDTO.setIdPersonType(personType.getIdPersonType());
        personTypeDTO.setNamePersonType(personType.getNamePersonType());
        return personTypeDTO;
    }
}
