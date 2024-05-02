package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Category;
import Proyecto.ProyectoDeAula.persistence.entity.RequestState;
import Proyecto.ProyectoDeAula.persistence.entity.RequestType;
import Proyecto.ProyectoDeAula.persistence.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class RequestDTO {
    private int idRequest;
    private User user;
    private RequestType requestType;
    private Category category;
    private String description;
    private Date date;
    private String answer;
    private RequestState requestState;
    private String mediumAnswer;
}
