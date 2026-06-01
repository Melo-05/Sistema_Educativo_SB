package com.plataform.Inscripcion_Estudiante_Curso_Server.Client;

import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.AsignacionClientDTO;
import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.EstudianteClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Asignacion-Curso-Asistente-Server")
public interface AsignacionClient{
    @GetMapping("/asignacion/findAsignacionById/{id}")
    AsignacionClientDTO buscarAsignacionPorId(@PathVariable Long id);
}
