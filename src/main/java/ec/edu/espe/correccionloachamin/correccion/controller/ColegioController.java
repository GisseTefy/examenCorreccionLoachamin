package ec.edu.espe.correccionloachamin.correccion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.correccionloachamin.correccion.domain.Colegio;
import ec.edu.espe.correccionloachamin.correccion.service.ColegioService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/colegio")
public class ColegioController {
    @Autowired
    private ColegioService colegioService;

    @PostMapping("/guardarcolegio")
    public ResponseEntity<Colegio> guardarColegio(@RequestBody Colegio colegio) {
        return new ResponseEntity<>(colegioService.create(colegio), HttpStatus.OK);
    }

    @GetMapping("/buscarcolegio")
    public ResponseEntity<List<Colegio>> Buscar(@PathParam("nombreColegio") String nombreColegio) {
        return new ResponseEntity<>(colegioService.BuscarColegioPorNombre(nombreColegio), HttpStatus.OK);
    }
}
