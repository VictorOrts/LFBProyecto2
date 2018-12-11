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

	public List<Contacto> buscar(String busca) {
		String query = "SELECT * FROM persona WHERE nombre LIKE % "+busca+";";
		List<Contacto> busqueda= new ArrayList<>();
		List<Contacto> contactos =contactoRepository.findAll();
		
		for (Contacto tmp : contactos) {
			if(tmp.getNombre().equals(busca)) {
				busqueda.add(tmp);
			}else {
				//contactos.remove(tmp.getId());
			}	
		}
		
		if(busqueda==null || busqueda.size()==0) {
			System.out.println("No existen contactos con ese nombre");
			System.out.println("Estos son los contactos creados: ");
			return contactos;
		}else {
			System.out.println("Los contactos encontrados son: ");
			return busqueda;
		}
				
	}


	
	public void FichaDetallada(int id) {
		contactoRepository.findById(id);
		return ;
	}

	
	public List<Contacto> listar() {
		//List<Contacto> contactos =;
		buscar("Victor");
		System.out.println("----Imprimiendo la lista");
		System.out.println(contactoRepository.findAll());
		return contactoRepository.findAll();
	}
	

}
