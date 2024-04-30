package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.RouteTipoIdentificacion;
import Proyecto.ProyectoDeAula.domain.dto.TipoIdentificacionDTO;
import Proyecto.ProyectoDeAula.domain.service.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RouteTipoIdentificacion.API)
public class TipoIdentificacionController {
    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    @PostMapping(value = RouteTipoIdentificacion.SAVE_TIPO_IDENTIFICACION)
    public TipoIdentificacionDTO save(@RequestBody TipoIdentificacionDTO tipoIdentificacionDTO){
        return tipoIdentificacionService.save(tipoIdentificacionDTO);
    }

    @GetMapping(value = RouteTipoIdentificacion.SAVE_TIPO_IDENTIFICACION)
    public List<TipoIdentificacionDTO> get(){return tipoIdentificacionService.getAll();}
}

