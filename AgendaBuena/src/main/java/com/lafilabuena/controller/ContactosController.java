package com.lafilabuena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lafilabuena.model.Contacto;

import com.lafilabuena.services.ContactosServicesImpl;
import com.lafilabuena.services.GenericServices;

/*
 * 
 * @author Jose M. Vicente
 */

@Controller("contactosController")
public class ContactosController {
	
	@Autowired
	@Qualifier("genericServices")
	public ContactosServicesImpl genericServices;
	

	@GetMapping("/")
	public ModelAndView listarContactos(){
		//ModelAndView mv=new ModelAndView();
		//mv.addObject("contactos", genericServices.listar());
		return null;
	}
	@PostMapping("/crearusuario")
	public String crearUsuario(@ModelAttribute (name="Contacto") Contacto contacto, Model model) {
		//genericServices.crear(contacto);
		//return "redirect:/***MODIFICAR**** pagina de listar contactos o lo que sea";
		return null;
		
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
