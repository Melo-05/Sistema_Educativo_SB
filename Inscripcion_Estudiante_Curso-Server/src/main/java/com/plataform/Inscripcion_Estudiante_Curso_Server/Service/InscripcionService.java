package com.plataform.Inscripcion_Estudiante_Curso_Server.Service;

import com.plataform.Inscripcion_Estudiante_Curso_Server.Client.AsignacionClient;
import com.plataform.Inscripcion_Estudiante_Curso_Server.Client.EstudianteClient;
import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.AsignacionClientDTO;
import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.EstudianteClientDTO;
import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.InscripcionRequestDTO;
import com.plataform.Inscripcion_Estudiante_Curso_Server.DTO.InscripcionResponseDTO;
import com.plataform.Inscripcion_Estudiante_Curso_Server.Model.InscripcionModel;
import com.plataform.Inscripcion_Estudiante_Curso_Server.Repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class InscripcionService {
    @Autowired
    InscripcionRepository repository_inscripcion;
    @Autowired
    EstudianteClient client_estudiante;
    @Autowired
    AsignacionClient client_asignacion;

    public List<InscripcionModel> listarInscripciones(){return repository_inscripcion.findAll();}

    public InscripcionResponseDTO agregarInscripcion(InscripcionRequestDTO request){
        EstudianteClientDTO estudiante = client_estudiante.buscarEstudiantePorId(request.getEstudianteIdInscripcion());
        AsignacionClientDTO asignacion = client_asignacion.buscarAsignacionPorId(request.getAsignacionIdInscripcion());
        if(estudiante == null){throw new RuntimeException("Estudiante no encontrado");}
        InscripcionModel inscripcion=new InscripcionModel();
        inscripcion.setEstudianteIdInscripcion(request.getEstudianteIdInscripcion());
        inscripcion.setAsignacionIdInscripcion(request.getAsignacionIdInscripcion());
        inscripcion.setTotalPuntosInscripcion(request.getTotalPuntosInscripcion());
        inscripcion.setFechaInscripcion(request.getFechaInscripcion());
        repository_inscripcion.save(inscripcion);
        return new InscripcionResponseDTO(
                inscripcion.getIdInscripcion(),
                estudiante,
                inscripcion.getAsignacionIdInscripcion(),
                inscripcion.getFechaInscripcion(),
                inscripcion.getTotalPuntosInscripcion()
        );
    }
}
