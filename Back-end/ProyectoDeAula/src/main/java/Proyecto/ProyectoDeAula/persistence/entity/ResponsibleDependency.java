package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Responsables_Dependencia ")
public class ResponsibleDependency {

    @Column(name = "Usuario")
    @Id
    private String user;

    @JoinColumn(name = "ID_Dependencia")
    @ManyToOne
    private Dependence dependence;
}
