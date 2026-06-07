package com.plataform.Nota_Evaluacion_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // habilita Feign para comunicarte con otros microservicios
public class NotaEvaluacionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotaEvaluacionServerApplication.class, args);
    }
}
