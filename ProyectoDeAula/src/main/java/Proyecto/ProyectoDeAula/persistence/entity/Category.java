package Proyecto.ProyectoDeAula.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categorias")
public class Category {

    @Column(name = "ID_Categoria")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;

    @Column(name = "Nombre_Categoria")
    private String nameCategory;


    @ManyToOne @JoinColumn(name = "ID_Dependencia")
    private Dependence dependence;
}
