package ec.edu.espe.correccionloachamin.correccion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.correccionloachamin.correccion.domain.AlumnoAsignatura;
import ec.edu.espe.correccionloachamin.correccion.service.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @PostMapping("/guardarmatricula")
    public ResponseEntity<AlumnoAsignatura> guardaMatricula(@RequestBody AlumnoAsignatura matricula) {
        return new ResponseEntity<>(matriculaService.create(matricula), HttpStatus.OK);
    }
}
