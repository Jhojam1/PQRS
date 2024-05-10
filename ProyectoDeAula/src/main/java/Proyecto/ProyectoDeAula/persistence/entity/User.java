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
    @Column(name = "Usuario")
    @Id
    private String user;

    @Column(name = "Contraseña")
    private String password;

    @JoinColumn(name = "ID_Persona")
    @OneToOne
    private Person person;

    @JoinColumn(name = "ID_Rol")
    @ManyToOne
    private Role role;
}
