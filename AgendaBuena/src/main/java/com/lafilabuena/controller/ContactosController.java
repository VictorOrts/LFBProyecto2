package com.lafilabuena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

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
	public ModelAndView listarContactos() {
		ModelAndView mv = new ModelAndView("view1");
		return mv.addObject("contactos", contactServices.listar());

	}

	@PostMapping("/crearusuario")
	public String crearUsuario(@ModelAttribute(name = "contacto1") Contacto contacto) {
		contactServices.crear(contacto);

		return "redirect:/";

	}


	@GetMapping("/addContacto")
	private String redirectContactForm1(@RequestParam(name = "id") int id, Model model) {
		Contacto contacto1 = new Contacto();
		if (id != 0) {
			contacto1 = contactServices.buscarPorId(id);
		}
		model.addAttribute("contacto1", contacto1);
//		
//		Contacto contact = new Contacto();
//
//		model.addAttribute("contacto1", contact);
		return "addContacto";

	}

	@GetMapping("/borrar")
	public ModelAndView delete(@RequestParam(name = "id", required = true) int id) {
		contactServices.borrar(id);
		return listarContactos();
	}

//	@GetMapping("/buscar")
//	public ModelAndView buscar(@RequestParam(name="name", required=true)Contacto contacto) {
//		ModelAndView mv=new ModelAndView("view1");
//		contacto.getNombre();
//		
//	Buscar en la query de mario con contacto.getnombre
//		
//		return mv;
//	}

//	@GetMapping("/fichadetallada")
//	public Contacto fichaDetallada(int id) {
//		Contacto contacto=new Contacto();
//		
//		contactServices.FichaDetallada(id);
//		return contacto;
//		
//	}
//	

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
