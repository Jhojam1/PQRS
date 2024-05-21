package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Roles")
public class Role {
    @Column(name = "ID_Rol")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre_Rol")
    private String nameRole;
}
