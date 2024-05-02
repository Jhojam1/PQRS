package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Personas")
public class Person {

    @Column(name = "ID_Persona")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPerson;

    @Column(name = "Nombre_Persona")
    private String name;

    @Column(name = "Apellido_Persona")
    private String lastName;

    @Column(name = "Correo_Persona")
    private String email;

    @JoinColumn(name = "ID_Tipo_Identificacion")
    @ManyToOne
    private IdentificationType identificationType;

    @Column(name = "Numero_Identificacion_Persona")
    private BigInteger identificationNumber;
}
