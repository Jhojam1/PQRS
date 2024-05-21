package Proyecto.ProyectoDeAula.domain.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestStateDTO {
    private Long idRequestState;
    private String nameRequestState;
}
