/**
 * 
 */
package com.lafilabuena.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lafilabuena.dao.ProvinciasRepository;
import com.lafilabuena.model.Provincias;

/**
 * @author jozee
 *
 */
@Service("provinciasServices")
public class ProvinciasServicesImpl {

	@Autowired
	public ProvinciasRepository provinciasRepo;
	
	public List<Provincias> findAll(){
		
		return provinciasRepo.findAll();
	}
	
}
