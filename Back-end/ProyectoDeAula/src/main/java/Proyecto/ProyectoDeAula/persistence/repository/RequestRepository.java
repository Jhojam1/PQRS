package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}
