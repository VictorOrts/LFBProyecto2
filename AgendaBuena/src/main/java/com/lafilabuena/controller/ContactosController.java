package com.lafilabuena.controller;

/**
 * Clase controller para la gestion de Agenda
 * @author Jose M. Vicente
 * @version 1.0  10/12/2018
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lafilabuena.dao.DireccionRepository;
import com.lafilabuena.dao.ProvinciasRepository;
import com.lafilabuena.model.Contacto;

import com.lafilabuena.services.ContactosServicesImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactosController.
 */
@Controller("contactosController")

public class ContactosController {

	/** The contact services. */
	@Autowired
	@Qualifier("contactosServices")
	public ContactosServicesImpl contactServices;

	/** The provinciasrepo. */
	@Autowired
	@Qualifier("provinciasRepository")
	public ProvinciasRepository provinciasrepo;

	/** The direccion repo. */
	@Autowired
	@Qualifier("direccionRepository")
	public DireccionRepository direccionRepo;
//	@Autowired
//	@Qualifier("provinciasServices")
//	public ProvinciasServicesImpl provinciasService;

//	public ModelAndView listarProvincias() {
//		ModelAndView mv= new ModelAndView();
//		return mv.add)
//	}
	/**
	 * Redirect tohome.
	 *
	 * @return the string
	 */
//	
	@GetMapping(" ")
	public String redirectTohome() {
		return "redirect:/";
	}

	/**
	 * Listar contactos.
	 *
	 * @return the model and view
	 */
	@GetMapping("/")
	public ModelAndView listarContactos() {
		ModelAndView mv = new ModelAndView("ListaView");
		mv.addObject("provincias", provinciasrepo.findAll());
		mv.addObject("direcciones", direccionRepo.findAll());
		return mv.addObject("contactos", contactServices.listar());
	}

	/**
	 * Ficha detallada.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/mostrarFicha")
	public String fichaDetallada(@RequestParam(name = "id") int id, Model model) {

		Contacto contacto = new Contacto();

		contacto = contactServices.buscarPorId(id);

		model.addAttribute("contacto", contacto);
		model.addAttribute("provincias", provinciasrepo.findAll());
		return "FichaDetallada";

	}

	/**
	 * Crear usuario.
	 *
	 * @param contacto the contacto
	 * @param model the model
	 * @return the string
	 */
	@PostMapping("/crearusuario")
	public String crearUsuario(@ModelAttribute(name = "contacto1") Contacto contacto, Model model) {
		contactServices.crear(contacto);

		return "redirect:/";

	}

	/**
	 * Redirect contact form 1.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/addContacto")
	private String redirectContactForm1(@RequestParam(name = "id") int id, Model model) {
		Contacto contacto1 = new Contacto();
		if (id != 0) {
			contacto1 = contactServices.buscarPorId(id);
		}
		model.addAttribute("contacto1", contacto1);
		model.addAttribute("provincias", provinciasrepo.findAll());
		return "addContacto";

	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the model and view
	 */
	@GetMapping("/borrar")
	public ModelAndView delete(@RequestParam(name = "id", required = true) int id) {
		contactServices.borrar(id);
		return listarContactos();
	}

}
