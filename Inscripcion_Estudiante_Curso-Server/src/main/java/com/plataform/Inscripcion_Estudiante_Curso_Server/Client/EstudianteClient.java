package com.plataform.Inscripcion_Estudiante_Curso_Server.Client;

import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.EstudianteClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Estudiante-Server")
public interface EstudianteClient {
    @GetMapping("/estudiante/findEstudianteById/{id}")
    EstudianteClientDTO buscarEstudiantePorId(@PathVariable Long id);
}
