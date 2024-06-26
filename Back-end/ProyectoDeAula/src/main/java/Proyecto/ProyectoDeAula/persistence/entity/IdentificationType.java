package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tipos_Identificacion")
public class IdentificationType {

    @Column(name = "ID_Tipo_Identificacion")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIdentificationType;

    @Column(name = "Nombre_Tipo_Identificacion")
    private String nameIdentificationType;

    public IdentificationType(Long idIdentificationType) {
        this.idIdentificationType = idIdentificationType;
    }
}