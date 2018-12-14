
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

/**
 * The Class ContactosServicesImpl.
 */
@Service("contactosServices")
public class ContactosServicesImpl {

	/** The Constant LOGGER. */
	private final static Logger LOGGER = Logger.getLogger("ContactosServicesImpl");

	/** The contacto repository. */
	@Autowired
	private ContactoRepository contactoRepository;

	/**
	 * Buscar por id.
	 *
	 * @param id the id
	 * @return the contacto
	 */
	public Contacto buscarPorId(int id) {
		Contacto c1 = contactoRepository.findById(id).orElse(new Contacto());

		return c1;
	}

	/**
	 * Crear.
	 *
	 * @param contacto the contacto
	 * @return the contacto
	 */
	public Contacto crear(Contacto contacto) {

		return contactoRepository.save(contacto);
	}

	/**
	 * Borrar.
	 *
	 * @param id the id
	 * @return the contacto
	 */
	public Contacto borrar(int id) {
		Contacto contacto = buscarPorId(id);
		if (contacto != null) {
			contactoRepository.delete(contacto);
		}
		return contacto;
	}

	/**
	 * Editar.
	 *
	 * @param contacto the contacto
	 * @return the contacto
	 */
	public Contacto editar(Contacto contacto) {
		contactoRepository.save(contacto);
		return contacto;
	}

	/**
	 * Buscar nombre.
	 *
	 * @param busca the busca
	 * @return the list
	 */
	public List<Contacto> buscarNombre(String busca) {
		List<Contacto> busqueda = new ArrayList<>();
		List<Contacto> contactos = (List<Contacto>) contactoRepository.findAll();

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

	/**
	 * Ficha detallada.
	 *
	 * @param id the id
	 */
	public void FichaDetallada(int id) {
		contactoRepository.findById(id);
		return;
	}

	/**
	 * Listar.
	 *
	 * @return the list
	 */
	public List<Contacto> listar() {
		// buscarNombre("Victor");
		LOGGER.log(Level.INFO, "----Imprimiendo la lista");
		return (List<Contacto>) contactoRepository.findAll();
	}

}
