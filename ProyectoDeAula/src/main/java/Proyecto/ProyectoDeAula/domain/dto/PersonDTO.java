package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.IdentificationType;
import Proyecto.ProyectoDeAula.persistence.entity.PersonType;
import lombok.*;

import java.math.BigInteger;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {
    private Long idPerson;
    private PersonType personType;
    private String name;
    private String lastName;
    private String email;
    private IdentificationType identificationType;
    private BigInteger identificationNumber;
}
