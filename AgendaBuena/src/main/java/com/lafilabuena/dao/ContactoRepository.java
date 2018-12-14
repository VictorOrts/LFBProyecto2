package com.lafilabuena.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Método crear Contacto
 * 
 * @author Jorge A Avilés Menéndez
 * @version 1.0 9/12/2018
 *
 */

import com.lafilabuena.model.Contacto;

/**
 * The Interface ContactoRepository.
 * 
 * @author Jorge Aviles.
 */
@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {

}
