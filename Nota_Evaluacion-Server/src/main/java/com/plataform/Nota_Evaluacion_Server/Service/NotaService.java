package com.plataform.Nota_Evaluacion_Server.Service;

import com.plataform.Nota_Evaluacion_Server.Model.NotaModel;
import com.plataform.Nota_Evaluacion_Server.Repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService {

    @Autowired
    private NotaRepository repository;

    public NotaModel agregarNota(NotaModel nota) {
        return repository.save(nota);
    }

    public List<NotaModel> listarNotas() {
        return repository.findAll();
    }

    public Optional<NotaModel> buscarNotaPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<NotaModel> actualizarNota(Long id, NotaModel nota) {
        return repository.findById(id).map(n -> {
            n.setEvaluacionIdNota(nota.getEvaluacionIdNota());
            n.setValorNota(nota.getValorNota());
            n.setFechaNota(nota.getFechaNota());
            return repository.save(n);
        });
    }

    public boolean eliminarNota(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
