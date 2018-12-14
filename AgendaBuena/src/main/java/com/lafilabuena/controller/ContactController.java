package com.lafilabuena.controller;

/**Clase ContactController
 * @author Jorge A Avilés Menéndez
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.lafilabuena.model.Contacto;
import com.lafilabuena.services.ContactosServicesImpl;

/**
 * The Class ContactController.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping({ "/contactos" })

public class ContactController {

	/** The contactos services. */
	@Autowired
	private ContactosServicesImpl contactosServices;

	/**
	 * Creates the.
	 *
	 * @param contacto the contacto
	 * @return the contacto
	 */
	@CrossOrigin(origins = "*")
	@PostMapping
	public Contacto create(@RequestBody Contacto contacto) {

		return contactosServices.crear(contacto);
	}

	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the contacto
	 */
	@GetMapping(path = { "ficha/{id}" })
	public Contacto findOne(@PathVariable("id") int id) {
		return contactosServices.buscarPorId(id);
	}

	/**
	 * Update.
	 *
	 * @param id the id
	 * @param contacto the contacto
	 * @return the contacto
	 */
	@PutMapping(path = { "/{id}" })
	public Contacto update(@PathVariable("id") int id, @RequestBody Contacto contacto) {
		contacto.setIdpersona(id);
		return contactosServices.editar(contacto);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the contacto
	 */
	@DeleteMapping(path = { "{id}" })
	public Contacto delete(@PathVariable("id") int id) {
		return contactosServices.borrar(id);
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@GetMapping
	public List<Contacto> findAll() {
		return contactosServices.listar();
	}
}
