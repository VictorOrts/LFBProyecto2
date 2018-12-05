package com.lafilabuena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lafilabuena.model.Contacto;

@RestController
public class ContactosController {
	@Autowired
	//private ContactosServices services;
	
	@RequestMapping()
	public List<Contacto> getContactos(){
		return null;
	}
	
}
