package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Dependencias")
public class Dependence {

    @Column(name = "ID_Dependencia")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDependence;

    @Column(name = "Nombre_Dependencia")
    private String nameDependence;
}
