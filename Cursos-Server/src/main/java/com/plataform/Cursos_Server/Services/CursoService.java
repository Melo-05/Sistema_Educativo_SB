package com.plataform.Cursos_Server.Services;

import com.plataform.Cursos_Server.Models.CursoModel;
import com.plataform.Cursos_Server.Repository.CursoRepository;
import com.plataform.Cursos_Server.DTOs.CursoRequest;
import com.plataform.Cursos_Server.DTOs.CursoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repositorio_curso;

    public List<CursoModel> listarCursos() {
        return repositorio_curso.findAll();
    }
    public Optional<CursoModel> buscarCursoPorId(Long id) {
        return repositorio_curso.findById(id);
    }
    public Optional<CursoModel> buscarCursoPorNombre(String nombreCurso) {
        return repositorio_curso.findByNombreCurso(nombreCurso);
    }

    public CursoResponse agregarCurso(CursoRequest request) {
        CursoModel curso = new CursoModel();
        curso.setNombreCurso(request.getNombreCurso());
        curso.setDescripcionCurso(request.getDescripcionCurso());
        curso.setCreditosCurso(request.getCreditosCurso());
        CursoModel guardado = repositorio_curso.save(curso);
        CursoResponse response=new CursoResponse();
        response.setNombreCurso(guardado.getNombreCurso());
        response.setDescripcionCurso(guardado.getDescripcionCurso());
        response.setCreditosCurso(guardado.getCreditosCurso());
        return response;
    }

    /*public Optional<CursoResponse> actualizarCurso(Long id, CursoRequest request) {
        return repo.findById(id)
                   .map(c -> {
                       c.setNombreCurso(request.getNombreCurso());
                       c.setDescripcionCurso(request.getDescripcionCurso());
                       c.setCreditosCurso(request.getCreditosCurso());
                       CursoModel updated = repo.save(c);
                       return new CursoResponse(updated);
                   });
    }*/

    public boolean eliminarCurso(Long id) {
        if (repositorio_curso.existsById(id)) {
            repositorio_curso.deleteById(id);
            return true;
        }
        return false;
    }
}
