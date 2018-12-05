package com.lafilabuena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.lafilabuena.model.Contacto;


@SpringBootApplication
@EnableJpaRepositories("com.lafilabuena.tests")
public class AgendaBuenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaBuenaApplication.class, args);
			}
}
