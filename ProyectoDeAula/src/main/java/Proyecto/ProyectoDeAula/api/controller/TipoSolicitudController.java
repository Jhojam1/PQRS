package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteTipoSolicitud;
import Proyecto.ProyectoDeAula.domain.dto.TipoSolicitudDTO;
import Proyecto.ProyectoDeAula.domain.service.TipoSolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = RouteTipoSolicitud.API)
public class TipoSolicitudController {
    @Autowired
    private TipoSolicitudService tipoSolicitudService;

    @PostMapping(value = RouteTipoSolicitud.SAVE_TIPO_SOLICITUD)
    public TipoSolicitudDTO save(@RequestBody TipoSolicitudDTO tipoSolicitudDTO){
        return tipoSolicitudService.save(tipoSolicitudDTO);
    }

    @GetMapping(value = RouteTipoSolicitud.SAVE_TIPO_SOLICITUD)
    public List<TipoSolicitudDTO> get(){return tipoSolicitudService.getAll();}
}
