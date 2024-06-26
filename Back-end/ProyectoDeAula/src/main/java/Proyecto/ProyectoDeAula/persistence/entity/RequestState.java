package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Estados_Solicitud ")
public class RequestState {

    @Column(name = "ID_Estado_Solicitud")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRequestState;

    @Column(name = "Nombre_Estado_Solicitud")
    private String nameRequestState;
}
