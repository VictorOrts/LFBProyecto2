package com.lafilabuena.tests;

import org.springframework.beans.factory.annotation.Autowired;

import com.lafilabuena.model.Contacto;


public class ArticleService {
	@Autowired
	   private ArticleRepository articleRepository;
	
	public void mostrar() {
		Contacto savedArticle = (Contacto) articleRepository.findAll(); 
		System.out.println(savedArticle);
		
	}
	
	
	
		
}
	
	 
	

