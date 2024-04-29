package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.ResponsableDependencia;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ResponsableDependenciaRepository extends JpaRepository<ResponsableDependencia, Long> {
}
