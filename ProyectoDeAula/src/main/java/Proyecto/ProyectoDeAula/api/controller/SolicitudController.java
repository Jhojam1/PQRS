package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteSolicitud;
import Proyecto.ProyectoDeAula.domain.dto.SolicitudDTO;
import Proyecto.ProyectoDeAula.domain.service.SolicitudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteSolicitud.API)
public class SolicitudController {
    @Autowired
    private SolicitudServices solicitudServices;

    @PostMapping(value = RouteSolicitud.SAVE_TIPO_SOLICITUD)
    public SolicitudDTO save(@RequestBody SolicitudDTO solicitudDTO){
        return solicitudServices.save(solicitudDTO);
    }

    @GetMapping(value = RouteSolicitud.SAVE_TIPO_SOLICITUD)
    public List<SolicitudDTO> get(){return solicitudServices.getAll();}
}
