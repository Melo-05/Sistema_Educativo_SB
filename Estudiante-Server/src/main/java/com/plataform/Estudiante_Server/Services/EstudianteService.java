package com.plataform.Estudiante_Server.Services;
import com.plataform.Estudiante_Server.Models.EstudianteModel;
import com.plataform.Estudiante_Server.Repository.EstudianteRepository;
import com.plataform.Estudiante_Server.DTOs.EstudianteRequest;
import com.plataform.Estudiante_Server.DTOs.EstudianteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository_estudiante;

    public List<EstudianteModel> listarEstudiantes() {
        return repository_estudiante.findAll();
    }
    public Optional<EstudianteModel> buscarEstudiantePorId(Long id) {
        return repository_estudiante.findById(id);
    }
    public Optional<EstudianteModel> buscarEstudiantePorDni(String dni) {
        return repository_estudiante.findByDniEstudiante(dni);
    }

    public EstudianteResponse agregarEstudiante(EstudianteRequest request) {
        EstudianteModel estudiante = new EstudianteModel();
        estudiante.setNombreEstudiante(request.getNombreEstudiante());
        estudiante.setApellidoEstudiante(request.getApellidoEstudiante());
        estudiante.setDniEstudiante(request.getDniEstudiante());
        estudiante.setCorreoEstudiante(request.getCorreoEstudiante());
        estudiante.setHabilitadoEstudiante(request.getHabilitadoEstudiante());
        estudiante.setRolEstudiante(request.getRolEstudiante());
        EstudianteModel guardado = repository_estudiante.save(estudiante);
        EstudianteResponse response=new EstudianteResponse();
        response.setIdEstudiante(guardado.getIdEstudiante());
        response.setNombreEstudiante(guardado.getNombreEstudiante());
        response.setApellidoEstudiante(guardado.getApellidoEstudiante());
        response.setDniEstudiante(guardado.getDniEstudiante());
        response.setCorreoEstudiante(guardado.getCorreoEstudiante());
        return response;
    }

    /*public Optional<EstudianteResponse> actualizarEstudiante(Long id, EstudianteRequest request) {
        return repository_estudiante.findById(id)
                   .map(e -> {
                       e.setNombreEstudiante(request.getNombreEstudiante());
                       e.setApellidoEstudiante(request.getApellidoEstudiante());
                       e.setDniEstudiante(request.getDniEstudiante());
                       e.setCorreoEstudiante(request.getCorreoEstudiante());
                       EstudianteModel updated = repository_estudiante.save(e);
                       return new EstudianteResponse(updated);
                   });
    }*/

    public boolean eliminarEstudiante(Long id) {
        if (repository_estudiante.existsById(id)) {
            repository_estudiante.deleteById(id);
            return true;
        }
        return false;
    }
}
