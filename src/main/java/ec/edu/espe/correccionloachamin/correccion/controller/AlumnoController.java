package ec.edu.espe.correccionloachamin.correccion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.correccionloachamin.correccion.domain.Alumno;
import ec.edu.espe.correccionloachamin.correccion.service.AlumnoService;


@RestController
@RequestMapping("/alumno")
public class AlumnoController {
@Autowired
    private AlumnoService alumnoService;
    @PostMapping("/guardaralumno")
    public ResponseEntity<Alumno> guardaAlumno(@RequestBody Alumno alumno) {
        return new ResponseEntity<>(alumnoService.create(alumno), HttpStatus.OK);
    }
}
