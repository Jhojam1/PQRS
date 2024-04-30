package Proyecto.ProyectoDeAula.domain.mapper;

import Proyecto.ProyectoDeAula.domain.dto.CategoriaDTO;
import Proyecto.ProyectoDeAula.persistence.entity.Categoria;

import java.util.Random;

public class CategoriaMapper {
    public static Categoria toEntity(CategoriaDTO categoriaDTO) {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(new Random().nextInt());
        categoria.setNombreCategoria(categoriaDTO.getNombreCategoria());
        categoria.setDependencia(categoriaDTO.getDependencia());
        return categoria;
    }

    public static CategoriaDTO toDTO(Categoria categoria) {
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setIdCategoria(categoria.getIdCategoria());
        categoriaDTO.setNombreCategoria(categoria.getNombreCategoria());
        categoriaDTO.setDependencia(categoria.getDependencia());
        return categoriaDTO;
    }
}
