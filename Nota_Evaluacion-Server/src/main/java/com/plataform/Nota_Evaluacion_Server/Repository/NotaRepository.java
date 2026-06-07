package com.plataform.Nota_Evaluacion_Server.Repository;

import com.plataform.Nota_Evaluacion_Server.Model.NotaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<NotaModel, Long> {
}
