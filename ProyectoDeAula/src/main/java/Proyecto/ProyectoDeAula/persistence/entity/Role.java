package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long id;
    @Column(name = "Nombre_Rol")
    private String nameRole;
}
