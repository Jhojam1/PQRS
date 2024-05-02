package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tipos_Solicitud ")
public class RequestType {

    @Column(name = "ID_Tipo_Solicitud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRequestType;

    @Column(name = "Nombre_Tipo_Solicitud")
    private String nameRequestType;
}