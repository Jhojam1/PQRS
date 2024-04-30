package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteEstadoSolicitud;
import Proyecto.ProyectoDeAula.domain.dto.EstadoSolicitudDTO;
import Proyecto.ProyectoDeAula.domain.service.EstadoSolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteEstadoSolicitud.API)
public class EstadoSolicitudController {
    @Autowired
    private EstadoSolicitudService estadoSolicitudService;

    @PostMapping(value = RouteEstadoSolicitud.SAVE_ESTADO)
    public EstadoSolicitudDTO save(@RequestBody EstadoSolicitudDTO estadoSolicitudDTO){
        return estadoSolicitudService.save(estadoSolicitudDTO);
    }

    @GetMapping(value = RouteEstadoSolicitud.SAVE_ESTADO)
    public List<EstadoSolicitudDTO> get(){return estadoSolicitudService.getAll();}
}
