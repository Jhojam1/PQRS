package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.RequestStateDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
