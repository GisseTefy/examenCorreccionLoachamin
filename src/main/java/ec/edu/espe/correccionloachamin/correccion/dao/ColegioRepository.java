package ec.edu.espe.correccionloachamin.correccion.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.correccionloachamin.correccion.domain.Colegio;


@Repository
public interface ColegioRepository extends CrudRepository<Colegio, Integer>{
    List<Colegio> findByNombreColegioContaining(String nombreColegio);
}
