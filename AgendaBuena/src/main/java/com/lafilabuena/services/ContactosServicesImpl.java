/**
 * 
 * 
 * @author Mario Alcañiz
 * fecha: 05/12/18
 * version 1.0
 *
 */

package com.lafilabuena.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lafilabuena.dao.ContactoRepository;
import com.lafilabuena.model.Contacto;
import com.lafilabuena.model.Provincias;



@Service("contactosServices")
public class ContactosServicesImpl {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	
	

	public Contacto crear(Contacto contacto) {
		contactoRepository.save(contacto);
		return contacto;
	}
	
	
	public void borrar(Contacto contacto) {
		contactoRepository.delete(contacto);
	}

	
	public Contacto editar(Contacto contacto) {
		contactoRepository.save(contacto);
		return contacto;
	}

	
	public <T> List<Contacto> buscar() {
		
		/*List<Contacto> contactos =contactoRepository.findAll();
		for(Contacto tmp : contactos) {
			if(tmp.getNombre().equals(contacto)) {
				return contactos;
			}else {
				System.out.println("No aparecen usuarios con ese nombre.");
			}
		}
		
		return contactos;
		*/
		return null;
	}
		

	
	public void FichaDetallada(int id) {
		contactoRepository.findById(id);
		return ;
	}

	
	public List<Contacto> listar() {
		//List<Contacto> contactos =;
		System.out.println("----Imprimiendo la lista");
		System.out.println(contactoRepository.findAll());
		return contactoRepository.findAll();
	}
	

}
