package ec.edu.espe.correccionloachamin.correccion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.correccionloachamin.correccion.domain.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer>{

}
