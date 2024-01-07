package ec.edu.espe.correccionloachamin.correccion.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.correccionloachamin.correccion.dao.AlumnoAsignaturaRepository;
import ec.edu.espe.correccionloachamin.correccion.dao.AlumnoRepository;
import ec.edu.espe.correccionloachamin.correccion.dao.AsignaturaRepository;
import ec.edu.espe.correccionloachamin.correccion.domain.Alumno;
import ec.edu.espe.correccionloachamin.correccion.domain.AlumnoAsignatura;
import ec.edu.espe.correccionloachamin.correccion.domain.Asignatura;
import ec.edu.espe.correccionloachamin.correccion.service.Exceptions.CreateException;

@Service
public class MatriculaService {
    private final AlumnoRepository alumnoRepository;
    private final AsignaturaRepository asignaturaRepository;
    private final AlumnoAsignaturaRepository alumnoAsignaturaRepository;

    public MatriculaService(AlumnoRepository alumnoRepository, AsignaturaRepository asignaturaRepository,
            AlumnoAsignaturaRepository alumnoAsignaturaRepository) {
        this.alumnoRepository = alumnoRepository;
        this.asignaturaRepository = asignaturaRepository;
        this.alumnoAsignaturaRepository = alumnoAsignaturaRepository;
    }

    public AlumnoAsignatura create(AlumnoAsignatura alumnoAsignatura) {
        try {
            Optional<Alumno> codAlumno = alumnoRepository.findById(alumnoAsignatura.getPK().getCodAlumno());
            Optional<Asignatura> codAsignatura = asignaturaRepository.findById(alumnoAsignatura.getPK().getCodAsignatura());
            if ((codAlumno.isPresent()) && (codAsignatura.isPresent())){
                return this.alumnoAsignaturaRepository.save(alumnoAsignatura);
            }
            else{
                throw new RuntimeException("Error al asignar un alumno a una asignatura, revise la existencia del alumno o de la asignatura");
            }
         
        } catch (Exception e) {
            throw new CreateException(
                    "Ocurrio un error al asignar un alumno a una asignatura: " + alumnoAsignatura.toString(), e);
        }
    }

}
// Implementar un método que permita asignar un alumno a una asignatura.
// Realizar las validaciones necesarias .
