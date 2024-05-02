package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tipos_Usuarios")
public class UserType {

    @Column(name="Id_Tipo_Usuario")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserType;


    @Column(name = "Nombre_Tipo_Identificacion")
    private String nameUserType;
}
