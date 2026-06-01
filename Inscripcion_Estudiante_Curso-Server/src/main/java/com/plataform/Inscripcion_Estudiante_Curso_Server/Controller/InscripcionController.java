package com.plataform.Inscripcion_Estudiante_Curso_Server.Controller;

import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.InscripcionRequestDTO;
import com.plataform.Inscripcion_Estudiante_Curso_Server.Model.InscripcionModel;
import com.plataform.Inscripcion_Estudiante_Curso_Server.Service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {
    @Autowired
    InscripcionService service_inscripcion;

    @GetMapping("listInscripciones")
    public List<InscripcionModel> listInscripciones(){
        return service_inscripcion.listarInscripciones();
    }

    @PostMapping("/addInscripcion")
    public ResponseEntity<?> addInscripcion (@RequestBody InscripcionRequestDTO request){
        return ResponseEntity.ok(service_inscripcion.agregarInscripcion(request));
    }
}
