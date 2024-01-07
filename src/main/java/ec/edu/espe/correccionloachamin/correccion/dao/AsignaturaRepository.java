package ec.edu.espe.correccionloachamin.correccion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.correccionloachamin.correccion.domain.Asignatura;

@Repository
public interface AsignaturaRepository extends CrudRepository<Asignatura, String>{

}
