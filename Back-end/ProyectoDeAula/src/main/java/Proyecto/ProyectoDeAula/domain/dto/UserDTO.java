package Proyecto.ProyectoDeAula.domain.dto;

import Proyecto.ProyectoDeAula.persistence.entity.Person;
import Proyecto.ProyectoDeAula.persistence.entity.Role;
import Proyecto.ProyectoDeAula.persistence.entity.PersonType;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String user;
    private String password;
    private Person person;
    private Role role;
    private String stateUser;
}
