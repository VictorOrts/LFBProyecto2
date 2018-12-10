package com.lafilabuena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lafilabuena.model.Contacto;

import com.lafilabuena.services.ContactosServicesImpl;

/*
 * 
 * @author Jose M. Vicente
 */

@Controller("contactosController")
public class ContactosController {
	
	@Autowired
	@Qualifier("contactosServices")
	public ContactosServicesImpl contactServices;
	
	@GetMapping(" ")
	public String redirectTohome() {
		return "redirect:/";
	}

	@GetMapping("/")
	public ModelAndView listarContactos(){
		ModelAndView mv=new ModelAndView("view1");
		return mv.addObject("contactos", contactServices.listar());
		
	}
	@PostMapping("/crearusuario")
	public Contacto crearUsuario(@ModelAttribute (name="contacto") Contacto contacto, Model model) {
		
		return contactServices.crear(contacto);
		
	}
	
	

	
	
//	@Autowired
//	//private ContactosServices services;
//	
//	@RequestMapping()
//	public List<Contacto> getContactos(){
//		return null;
//	}
//		}
	

	
	
//	@Autowired
//	//private ContactosServices services;
//	
//	@RequestMapping()
//	public List<Contacto> getContactos(){
//		return null;
//	}
//	
}
