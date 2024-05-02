package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuarios")
public class User {
    @Column(name = "ID_Usuario")
    @Id
    private int idUser;

    @Column(name = "Usuario")
    private String user;

    @Column(name = "Contraseña")
    private String password;

    @JoinColumn(name = "ID_Persona")
    @OneToOne
    private Person person;

    @JoinColumn(name = "ID_Tipo_Usuario")
    @ManyToOne
    private UserType userType;
}
