package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {
}
