package ec.edu.espe.correccionloachamin.correccion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.correccionloachamin.correccion.dao.ColegioRepository;
import ec.edu.espe.correccionloachamin.correccion.domain.Colegio;
import ec.edu.espe.correccionloachamin.correccion.service.Exceptions.CreateException;

@Service
public class ColegioService {
    private final ColegioRepository colegioRepository;

    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }
    public Colegio create(Colegio colegio) {
        try {
            return this.colegioRepository.save(colegio);
        } catch (Exception e) {
            throw new CreateException(
                    "Ocurrio un error al crear el Colegio: " + colegio.toString(), e);
        }
    }

    public List<Colegio> BuscarColegioPorNombre(String Nombre) {
        return this.colegioRepository.findByNombreColegioContaining(Nombre);
    }
}

