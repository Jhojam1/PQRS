package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.ResponsibleDependency;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ResponsibleDependencyRepository extends JpaRepository<ResponsibleDependency, Long> {
}
