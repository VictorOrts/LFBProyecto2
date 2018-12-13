package com.lafilabuena.controller;
/**Clase ContactController
 * @author Jorge A Avilés Menéndez
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.lafilabuena.model.Contacto;
import com.lafilabuena.services.ContactosServicesImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/contactos"})

public class ContactController {

	@Autowired
	private ContactosServicesImpl contactosServices;
	
	@CrossOrigin(origins="*")
	@PostMapping
	public Contacto create(@RequestBody Contacto contacto ) {
		
		return contactosServices.crear(contacto);
	}
	
	@GetMapping(path = {"ficha/{id}"})
	public Contacto findOne(@PathVariable("id") int id) {
		return contactosServices.buscarPorId(id);
	}
	
	@PutMapping(path= {"/{id}"})
	public Contacto update(@PathVariable("id") int id, @RequestBody Contacto contacto) {
		contacto.setIdpersona(id);
		return contactosServices.editar(contacto);
	}
	
	@DeleteMapping(path= {"{id}"})
	public Contacto delete(@PathVariable("id")int id) {
		return contactosServices.borrar(id);
	}
	
	@GetMapping
	public List<Contacto> findAll(){
		return contactosServices.listar();
	}
}
