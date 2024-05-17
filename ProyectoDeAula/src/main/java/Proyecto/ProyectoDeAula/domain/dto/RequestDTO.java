package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.*;
import lombok.*;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestDTO {
    private Long idRequest;
    private User user;
    private RequestType requestType;
    private Dependence dependence;
    private Category category;
    private String description;
    private Date date;
    private String answer;
    private RequestState requestState;
    private String mediumAnswer;
}
