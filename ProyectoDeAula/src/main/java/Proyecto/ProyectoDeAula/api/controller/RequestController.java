package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteRequest;
import Proyecto.ProyectoDeAula.domain.dto.RequestDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteRequest.API)
public class RequestController {
    @Autowired
    private RequestServices requestServices;

    @PostMapping(value = RouteRequest.SAVE_TIPO_SOLICITUD)
    public RequestDTO save(@RequestBody RequestDTO requestDTO){
        return requestServices.save(requestDTO);
    }

    @GetMapping(value = RouteRequest.SAVE_TIPO_SOLICITUD)
    public List<RequestDTO> get(){return requestServices.getAll();}
}
