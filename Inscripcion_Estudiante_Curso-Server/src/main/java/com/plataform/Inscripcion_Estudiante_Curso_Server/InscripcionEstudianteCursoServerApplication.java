package com.plataform.Inscripcion_Estudiante_Curso_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class InscripcionEstudianteCursoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InscripcionEstudianteCursoServerApplication.class, args);
	}

}
