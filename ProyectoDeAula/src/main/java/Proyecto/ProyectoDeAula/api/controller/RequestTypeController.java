package Proyecto.ProyectoDeAula.api.controller;

import Proyecto.ProyectoDeAula.domain.common.Route;
import Proyecto.ProyectoDeAula.domain.dto.RequestTypeDTO;
import Proyecto.ProyectoDeAula.domain.dto.UserDTO;
import Proyecto.ProyectoDeAula.domain.service.RequestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value = Route.API + Route.RequestType.RequestType)
public class RequestTypeController {
    @Autowired
    private RequestTypeService requestTypeService;

    @PostMapping(value = Route.RequestType.SAVE_REQUEST_TYPE)
    public RequestTypeDTO save(@RequestBody RequestTypeDTO requestTypeDTO){
        return requestTypeService.save(requestTypeDTO);
    }

    @GetMapping(value = Route.RequestType.GET_REQUEST_TYPE)
    public List<RequestTypeDTO> get(){return requestTypeService.getAll();}

    @PutMapping(value = Route.RequestType.UPDATE_REQUEST_TYPE)
    public ResponseEntity<?> update(@RequestBody RequestTypeDTO requestTypeDTO) {
        Optional<RequestTypeDTO> requestTypeDTOOptional = requestTypeService.findById(requestTypeDTO.getIdRequestType());
        if(requestTypeDTOOptional.isPresent()) {
            requestTypeService.save(requestTypeDTO);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
