package com.projeto.padraoprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * O seguintes módulos foram selecionados:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * - OpenFeign
 * 
 * @author vicentejluz
 */
@EnableFeignClients
@SpringBootApplication
public class DesafioDioPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioPadroesProjetoSpringApplication.class, args);
	}

}
