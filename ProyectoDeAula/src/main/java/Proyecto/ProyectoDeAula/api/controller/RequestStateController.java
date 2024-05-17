package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.RequestStateDTO;
import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = Route.API + Route.RequestState.RequestState)
public class RequestStateController {
    @Autowired
    private RequestStateService requestStateService;

    @PostMapping(value = Route.RequestState.SAVE_REQUEST_STATE)
    public RequestStateDTO save(@RequestBody RequestStateDTO requestStateDTO){
        return requestStateService.save(requestStateDTO);
    }

    @GetMapping(value = Route.RequestState.GET_REQUEST_STATE)
    public List<RequestStateDTO> get(){return requestStateService.getAll();}

    @PutMapping(value = Route.User.UPDATE_USUARIO)
    public ResponseEntity<?> update(@RequestBody RequestStateDTO requestStateDTO) {
        Optional<RequestStateDTO> requestStateDTOOptional = requestStateService.findById(requestStateDTO.getIdRequestState());
        if(requestStateDTOOptional.isPresent()) {
            requestStateService.save(requestStateDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
