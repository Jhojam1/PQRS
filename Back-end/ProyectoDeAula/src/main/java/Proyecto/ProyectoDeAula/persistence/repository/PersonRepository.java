package Proyecto.ProyectoDeAula.persistence.repository;

import Proyecto.ProyectoDeAula.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
