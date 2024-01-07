package ec.edu.espe.correccionloachamin.correccion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.correccionloachamin.correccion.domain.AlumnoAsignatura;
import ec.edu.espe.correccionloachamin.correccion.domain.AlumnoAsignaturaPK;

@Repository
public interface AlumnoAsignaturaRepository extends CrudRepository<AlumnoAsignatura, AlumnoAsignaturaPK>{

}
