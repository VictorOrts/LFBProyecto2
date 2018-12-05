package com.lafilabuena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lafilabuena.dao.ContactoDaoImp;
import com.lafilabuena.dao.GenericDao;

@SpringBootApplication
public class AgendaBuenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaBuenaApplication.class, args);
		
		
		GenericDao dao=new ContactoDaoImp();
		dao.crear();
		dao.crear();
		dao.crear();
		dao.listar();
		
	}
}
