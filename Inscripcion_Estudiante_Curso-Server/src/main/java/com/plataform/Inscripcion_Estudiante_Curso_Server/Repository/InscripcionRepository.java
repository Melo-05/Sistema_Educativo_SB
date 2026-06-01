package com.plataform.Inscripcion_Estudiante_Curso_Server.Repository;

import com.plataform.Inscripcion_Estudiante_Curso_Server.Model.InscripcionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<InscripcionModel,Long> {
}
