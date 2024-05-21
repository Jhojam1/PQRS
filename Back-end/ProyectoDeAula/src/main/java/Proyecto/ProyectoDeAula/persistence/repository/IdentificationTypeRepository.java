package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.IdentificationType;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface IdentificationTypeRepository extends JpaRepository<IdentificationType, Long> {
}
