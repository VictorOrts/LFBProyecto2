/**
 * 
 * 
 * @author Mario Alcañiz
 * fecha: 05/12/18
 * version 1.0
 *
 */

package com.lafilabuena.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.hibernate.annotations.Where;
import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lafilabuena.dao.ContactoRepository;
import com.lafilabuena.model.Contacto;
import com.lafilabuena.model.Provincias;



@Service("contactosServices")
public class ContactosServicesImpl {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	public Contacto buscarPorId(int id) {
		Contacto c1 = contactoRepository.findById(id)
				.orElse(new Contacto());

		return c1;
	}
	

	public Contacto crear(Contacto contacto) {
		
		return contactoRepository.save(contacto);
	}
	
	
	public void borrar(int id) {
		contactoRepository.deleteById(id);
	}

	
	public Contacto editar(Contacto contacto) {
		contactoRepository.save(contacto);
		return contacto;
	}

	
	public <T> List<Contacto> buscar(String busco) {
		
		String query = "SELECT * FROM persona WHERE nombre LIKE % "+busco+";";
		
//		List<Contacto> busqueda= new ArrayList<>();
//		for (Contacto contacto : query) {
//			
//		}
		
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
