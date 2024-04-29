package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.EstadoSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EstadoSolicitudRepository extends JpaRepository<EstadoSolicitud, Long> {
}
