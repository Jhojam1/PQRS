package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteRequestState;
import Proyecto.ProyectoDeAula.domain.dto.RequestStateDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteRequestState.API)
public class RequestStateController {
    @Autowired
    private RequestStateService requestStateService;

    @PostMapping(value = RouteRequestState.SAVE_ESTADO)
    public RequestStateDTO save(@RequestBody RequestStateDTO requestStateDTO){
        return requestStateService.save(requestStateDTO);
    }

    @GetMapping(value = RouteRequestState.SAVE_ESTADO)
    public List<RequestStateDTO> get(){return requestStateService.getAll();}
}
