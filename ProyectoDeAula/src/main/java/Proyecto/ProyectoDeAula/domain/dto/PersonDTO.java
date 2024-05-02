package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.IdentificationType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Setter
@Getter
public class PersonDTO {
    private int idPerson;
    private String name;
    private String lastName;
    private String email;
    private IdentificationType identificationType;
    private BigInteger identificationNumber;
}
