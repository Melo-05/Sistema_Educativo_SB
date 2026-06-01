package com.plataform.Evaluacion_Curso_Server.Service;

import com.plataform.Evaluacion_Curso_Server.Client.AsignacionClient;
import com.plataform.Evaluacion_Curso_Server.Client.InscripcionClient;
import com.plataform.Evaluacion_Curso_Server.DTOs.AsignacionClientDTO;
import com.plataform.Evaluacion_Curso_Server.DTOs.EvaluacionRequest;
import com.plataform.Evaluacion_Curso_Server.DTOs.EvaluacionResponse;
import com.plataform.Evaluacion_Curso_Server.DTOs.InscripcionClientDTO;
import com.plataform.Evaluacion_Curso_Server.Model.EvaluacionModel;
import com.plataform.Evaluacion_Curso_Server.Repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionService {
    @Autowired
    EvaluacionRepository repository_evaluacion;
    @Autowired
    AsignacionClient client_asignacion;
    @Autowired
    InscripcionClient client_inscripcion;
    public List<EvaluacionModel> listarEvaluaciones(){
        return repository_evaluacion.findAll();
    }

    public EvaluacionResponse addEvaluacion(EvaluacionRequest request){
        AsignacionClientDTO asignacion = client_asignacion.buscarAsistentePorId(request.getAsignacionCuAsEvalucion());
        if(asignacion == null){throw new RuntimeException("Asignacion no encontrado");}
        InscripcionClientDTO inscripcion = client_inscripcion.buscarInscripcionPorId(request.getInscripcionEsCuEvaluacion());
        if(inscripcion == null){throw new RuntimeException("Inscripcion no encontrado");}
        EvaluacionModel evaluacion = new EvaluacionModel();
        evaluacion.setAsignacionCuAsEvalucion(request.getAsignacionCuAsEvalucion());
        evaluacion.setInscripcionEsCuEvaluacion(request.getInscripcionEsCuEvaluacion());
        evaluacion.setTituloEvaluacion(request.getTituloEvaluacion());
        evaluacion.setPorcentajeEvaluacion(request.getPorcentajeEvaluacion());
        evaluacion.setFechaSubidaEvaluacion(request.getFechaSubidaEvaluacion());
        evaluacion.setPuntosEvaluacion(request.getPuntosEvaluacion());
        repository_evaluacion.save(evaluacion);
        return new EvaluacionResponse(
                asignacion,
                inscripcion,
                evaluacion.getTituloEvaluacion(),
                evaluacion.getPorcentajeEvaluacion(),
                evaluacion.getFechaSubidaEvaluacion(),
                evaluacion.getPuntosEvaluacion()
        );
    }




}
