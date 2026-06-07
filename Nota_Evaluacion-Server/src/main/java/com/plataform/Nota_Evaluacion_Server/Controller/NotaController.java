package com.plataform.Nota_Evaluacion_Server.Controller;

import com.plataform.Nota_Evaluacion_Server.Model.NotaModel;
import com.plataform.Nota_Evaluacion_Server.Service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nota")
public class NotaController {

    @Autowired
    private NotaService service;

    @PostMapping
    public ResponseEntity<NotaModel> crearNota(@RequestBody NotaModel nota) {
        return ResponseEntity.ok(service.agregarNota(nota));
    }

    @GetMapping
    public ResponseEntity<List<NotaModel>> listarNotas() {
        return ResponseEntity.ok(service.listarNotas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotaModel> obtenerNota(@PathVariable Long id) {
        Optional<NotaModel> nota = service.buscarNotaPorId(id);
        return nota.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<NotaModel> actualizarNota(@PathVariable Long id, @RequestBody NotaModel nota) {
        Optional<NotaModel> actualizada = service.actualizarNota(id, nota);
        return actualizada.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarNota(@PathVariable Long id) {
        if (service.eliminarNota(id)) {
            return ResponseEntity.ok("Nota eliminada correctamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
