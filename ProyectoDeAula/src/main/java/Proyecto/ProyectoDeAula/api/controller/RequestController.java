package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.RequestDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API + Route.Request.Request)
public class RequestController {
    @Autowired
    private RequestServices requestServices;

    @PostMapping(value = Route.Request.SAVE_REQUEST)
    public RequestDTO save(@RequestBody RequestDTO requestDTO){
        return requestServices.save(requestDTO);
    }

    @GetMapping(value = Route.Request.GET_REQUEST)
    public List<RequestDTO> get(){return requestServices.getAll();}
}
