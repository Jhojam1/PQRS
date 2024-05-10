package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tipos_Persona")
public class PersonType {

    @Column(name="Id_Tipo_Persona")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonType;


    @Column(name = "Nombre_Tipo_Persona")
    private String namePersonType;
}
