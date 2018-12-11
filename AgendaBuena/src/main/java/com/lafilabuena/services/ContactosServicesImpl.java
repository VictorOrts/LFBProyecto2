
package com.lafilabuena.services;

/**
 * Clase Services para Contactos 
 * 
 * @author Mario Alcañiz
 * @version 1.0 05/12/18
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lafilabuena.dao.ContactoRepository;
import com.lafilabuena.model.Contacto;

@Service("contactosServices")
public class ContactosServicesImpl {
	private final static Logger LOGGER = Logger.getLogger("ContactosServicesImpl");
	@Autowired
	private ContactoRepository contactoRepository;

	public Contacto buscarPorId(int id) {
		Contacto c1 = contactoRepository.findById(id).orElse(new Contacto());

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

	public List<Contacto> buscarNombre(String busca) {
		List<Contacto> busqueda = new ArrayList<>();
		List<Contacto> contactos = contactoRepository.findAll();

		for (Contacto tmp : contactos) {
			if (tmp.getNombre().equals(busca)) {
				busqueda.add(tmp);
			} else {
				// contactos.remove(tmp.getId());
			}
		}

		if (busqueda == null || busqueda.size() == 0) {
			LOGGER.log(Level.INFO, "No existen contactos con ese nombre");
			return contactos;
		} else {
			LOGGER.log(Level.INFO, "Encontro coincidencias en la busqueda");
			return busqueda;
		}

	}

	public void FichaDetallada(int id) {
		contactoRepository.findById(id);
		return;
	}

	public List<Contacto> listar() {
		// buscarNombre("Victor");
		LOGGER.log(Level.INFO, "----Imprimiendo la lista");
		return contactoRepository.findAll();
	}

}
