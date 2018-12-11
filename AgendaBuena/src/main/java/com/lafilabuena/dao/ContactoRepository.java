package com.lafilabuena.dao;

/**
 * Método crear Contacto
 * 
 * @author Jorge A Avilés Menéndez
 * @version 1.0 9/12/2018
 *
 */
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lafilabuena.model.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
