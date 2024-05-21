package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.RequestStateDTO;
import Proyecto.ProyectoDeAula.persistence.entity.RequestState;


public class RequestStateMapper {
    public static RequestState toEntity(RequestStateDTO requestStateDTO) {
        RequestState requestState = new RequestState();
        requestState.setIdRequestState(requestStateDTO.getIdRequestState());
        requestState.setNameRequestState(requestStateDTO.getNameRequestState());
        return requestState;
    }

    public static RequestStateDTO toDTO(RequestState requestState) {
        RequestStateDTO requestStateDTO = new RequestStateDTO();
        requestStateDTO.setIdRequestState(requestState.getIdRequestState());
        requestStateDTO.setNameRequestState(requestState.getNameRequestState());
        return requestStateDTO;
    }
}
