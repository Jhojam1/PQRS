package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.TipoSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface TipoSolicitudRepository extends JpaRepository<TipoSolicitud, Long> {
}
