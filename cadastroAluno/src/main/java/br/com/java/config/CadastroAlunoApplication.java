package br.com.java.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroAlunoApplication.class, args);
		System.out.println("Eu estou rodando");
	}

}
