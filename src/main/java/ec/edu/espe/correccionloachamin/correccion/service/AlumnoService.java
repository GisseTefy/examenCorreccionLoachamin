package ec.edu.espe.correccionloachamin.correccion.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.correccionloachamin.correccion.dao.AlumnoRepository;
import ec.edu.espe.correccionloachamin.correccion.dao.ColegioRepository;
import ec.edu.espe.correccionloachamin.correccion.domain.Alumno;
import ec.edu.espe.correccionloachamin.correccion.domain.Colegio;
import ec.edu.espe.correccionloachamin.correccion.service.Exceptions.CreateException;

@Service
public class AlumnoService {
    private final ColegioRepository colegioRepository;
    private final AlumnoRepository alumnoRepository;

    public AlumnoService(ColegioRepository colegioRepository, AlumnoRepository alumnoRepository) {
        this.colegioRepository = colegioRepository;
        this.alumnoRepository = alumnoRepository;
    }

    public Alumno create(Alumno alumno) {
        try {
            Integer codigoC = alumno.getCodColegio();
            Optional<Colegio> colegio = colegioRepository.findById(codigoC);
            Date fechaNacimiento = alumno.getFechaNacimiento();
            Date fechaActual = new Date(System.currentTimeMillis());
            if ((fechaNacimiento.before(fechaActual)) && (colegio.isPresent())) {
                return this.alumnoRepository.save(alumno);
            } else {
                throw new RuntimeException(
                        "Error al crear el alumno, revise el colegio y fecha de nacimiento del alumno");
            }

        } catch (Exception e) {
            throw new CreateException(
                    "Ocurrio un error al crear el Alumno: " + alumno.toString(), e);
        }
    }

}
