package com.lafilabuena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import Services.ContactosServicesImpl;
import Services.GenericServices;

/*
 * 
 * @author Jose M. Vicente
 */

@Controller("contactosController")
public class ContactosController {
	
	@Autowired
	@Qualifier("genericServices")
	public GenericServices genericServices;
	

	
	public ModelAndView listarContactos(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("contactos", genericServices.listar());
	}
	
	
//	@Autowired
//	//private ContactosServices services;
//	
//	@RequestMapping()
//	public List<Contacto> getContactos(){
//		return null;
//	}
//	
}
