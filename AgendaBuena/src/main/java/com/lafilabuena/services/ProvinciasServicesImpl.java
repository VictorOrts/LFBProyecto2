
package com.lafilabuena.services;

/**
 * Clase Services para Provincias
 * @author Jose Manuel Vicente
 * @version 1.0 11/12/2018
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lafilabuena.dao.ProvinciasRepository;
import com.lafilabuena.model.Provincias;

/**
 * The Class ProvinciasServicesImpl.
 */
@Service("provinciasServices")
public class ProvinciasServicesImpl {

	/** The provincias repo. */
	@Autowired
	public ProvinciasRepository provinciasRepo;

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Provincias> findAll() {

		return provinciasRepo.findAll();
	}

}
