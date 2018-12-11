
package com.lafilabuena.services;

/**
 * Clase Services para Provincias
 * @author jozee
 * @version 1.0 11/12/2018
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lafilabuena.dao.ProvinciasRepository;
import com.lafilabuena.model.Provincias;

@Service("provinciasServices")
public class ProvinciasServicesImpl {

	@Autowired
	public ProvinciasRepository provinciasRepo;

	public List<Provincias> findAll() {

		return provinciasRepo.findAll();
	}

}
