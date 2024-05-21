package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.RequestTypeDTO;
import Proyecto.ProyectoDeAula.persistence.entity.RequestType;


public class RequestTypeMapper
{
    public static RequestType toEntinty(RequestTypeDTO requestTypeDTO){
        RequestType tipoSoli = new RequestType();
        tipoSoli.setIdRequestType(requestTypeDTO.getIdRequestType());
        tipoSoli.setNameRequestType(requestTypeDTO.getNameRequestType());
        return tipoSoli;
    }

    public static RequestTypeDTO toDto(RequestType requestType){
        RequestTypeDTO requestTypeDTO = new RequestTypeDTO();
        requestTypeDTO.setIdRequestType(requestType.getIdRequestType());
        requestTypeDTO.setNameRequestType(requestType.getNameRequestType());
        return requestTypeDTO;
    }
}
