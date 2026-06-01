package com.plataform.Evaluacion_Curso_Server.Client;

import com.plataform.Evaluacion_Curso_Server.DTOs.AsignacionClientDTO;
import com.plataform.Evaluacion_Curso_Server.DTOs.InscripcionClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Inscripcion-Estudiante-Curso-Server")
public interface InscripcionClient {
    @GetMapping("/inscripcion/findInscripcionById/{id}")
    InscripcionClientDTO buscarInscripcionPorId(@PathVariable Long id);
}
