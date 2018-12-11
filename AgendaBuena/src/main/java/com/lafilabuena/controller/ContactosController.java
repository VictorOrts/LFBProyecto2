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

import com.lafilabuena.dao.ProvinciasRepository;
import com.lafilabuena.model.Contacto;

import com.lafilabuena.services.ContactosServicesImpl;
import com.lafilabuena.services.ProvinciasServicesImpl;

/*
 * 
 * @author Jose M. Vicente
 */

@Controller("contactosController")

public class ContactosController {

	@Autowired
	@Qualifier("contactosServices")
	public ContactosServicesImpl contactServices;

	@Autowired
	@Qualifier("provinciasRepository")
	public ProvinciasRepository provinciasrepo;
//	@Autowired
//	@Qualifier("provinciasServices")
//	public ProvinciasServicesImpl provinciasService;
	
//	public ModelAndView listarProvincias() {
//		ModelAndView mv= new ModelAndView();
//		return mv.add)
//	}
//	
	@GetMapping(" ")
	public String redirectTohome() {
		return "redirect:/";
	}

	@GetMapping("/")
	public ModelAndView listarContactos() {
		ModelAndView mv = new ModelAndView("view1");
		
		return mv.addObject("contactos", contactServices.listar());

	}

	@GetMapping("/mostrarFicha")
	public String fichaDetallada(@RequestParam(name="id") int id, Model model) {
		
		Contacto contacto = new Contacto();
		
		contacto = contactServices.buscarPorId(id);
		
		model.addAttribute("contacto", contacto);
		return "FichaDetallada";
		
	}
	
	@PostMapping("/crearusuario")
	public String crearUsuario(@ModelAttribute(name = "contacto1") Contacto contacto, Model model) {
		contactServices.crear(contacto);
		
		return "redirect:/";

	}


	@GetMapping("/addContacto")
	private String redirectContactForm1(@RequestParam(name = "id") int id, Model model) {
		Contacto contacto1 = new Contacto();
		ProvinciasServicesImpl p1=new ProvinciasServicesImpl();
		
		if (id != 0) {
			contacto1 = contactServices.buscarPorId(id);
		}
		model.addAttribute("contacto1", contacto1);
		model.addAttribute("provincias", provinciasrepo.findAll());
		return "addContacto";

	}

	@GetMapping("/borrar")
	public ModelAndView delete(@RequestParam(name = "id", required = true) int id) {
		contactServices.borrar(id);
		return listarContactos();
	}


}
