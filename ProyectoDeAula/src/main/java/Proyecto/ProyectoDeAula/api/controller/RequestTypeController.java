package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteRequestType;
import Proyecto.ProyectoDeAula.domain.dto.RequestTypeDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = RouteRequestType.API)
public class RequestTypeController {
    @Autowired
    private RequestTypeService requestTypeService;

    @PostMapping(value = RouteRequestType.SAVE_TIPO_SOLICITUD)
    public RequestTypeDTO save(@RequestBody RequestTypeDTO requestTypeDTO){
        return requestTypeService.save(requestTypeDTO);
    }

    @GetMapping(value = RouteRequestType.SAVE_TIPO_SOLICITUD)
    public List<RequestTypeDTO> get(){return requestTypeService.getAll();}
}
