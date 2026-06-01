package com.plataform.Evaluacion_Curso_Server.Client;

import com.plataform.Evaluacion_Curso_Server.DTOs.AsignacionClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Asignacion-Curso-Asistente-Server")
public interface AsignacionClient {
    @GetMapping("/asignacion/findAsignacionById/{id}")
    AsignacionClientDTO buscarAsistentePorId(@PathVariable Long id);
}
