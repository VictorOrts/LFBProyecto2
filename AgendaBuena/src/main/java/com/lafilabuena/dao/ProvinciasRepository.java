package com.lafilabuena.dao;

/**
 * Método crear Contacto
 * 
 * @author Victor Orts
 * @version 1.0 10/12/2018 
 */
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lafilabuena.model.Provincias;

/**
 * The Interface ProvinciasRepository.
 */
@Repository("provinciasRepository")
public interface ProvinciasRepository extends JpaRepository<Provincias, Integer> {

}
