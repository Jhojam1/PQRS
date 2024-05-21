package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.RequestType;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RequestTypeRepository extends JpaRepository<RequestType, Long> {
}
